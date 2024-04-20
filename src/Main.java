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


        // HardTask

        // Не понял в задании по поводу того зачем передавать ID

        user1.setFriend(user2);
        SystemUser user4 = user1.clone();
        SystemUser user5 = user1.deepClone();
        user4.setUserName("Vova");    //  Изменяем клонированный юзер
        user5.setUserName("Bob");     //  Изменяем глубоко клонированный юзер в первом порядке
        user5.setFriend(user4);       //  Изменяем глубоко клонированный юзер во втором порядке
        System.out.println(user1);    //  Печтаем юзер от которого клонировали
        System.out.println(user4);    //  Печтаем юзер после простого клонирования
        System.out.println(user5);    //  Печтаем юзер после глубокого клонирования



    }
}