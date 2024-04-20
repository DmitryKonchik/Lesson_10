public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SystemUser user1 = new SystemUser(1, "Dima", "qwert1");
        SystemUser user2 = new SystemUser(1, "Dima", "qwert1");
        SystemUser user3 = new SystemUser(2, "Dima1", "qwert2");



        System.out.println(user2.equals(user1));
        System.out.println(user2 == user1);
        System.out.println(user2.equals(user3));
        System.out.println(user2.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}