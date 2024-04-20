import java.util.Objects;

public class SystemUser implements Cloneable{
    private int ID;
    private String userName;
    private String password;
    private SystemUser friend;


    public SystemUser(int ID, String userName, String password) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setFriend(SystemUser friend) {
        this.friend = friend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser that = (SystemUser) o;
        return ID == that.ID && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, userName, password);
    }


    @Override
    public String toString() {
        return "SystemUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", friend=" + friend +
                '}';
    }

    // HardTask
    @Override
    protected SystemUser clone() throws CloneNotSupportedException {
        return (SystemUser) super.clone();
    }
    public SystemUser deepClone() throws CloneNotSupportedException {
        SystemUser cloned = (SystemUser) super.clone();
        cloned.friend = cloned.friend.clone();
        return cloned;
    }
}
