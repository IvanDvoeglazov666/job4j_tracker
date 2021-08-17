package ru.job4j.pojo;

public class College {
    public static void main(String[] agr) {
        Student user = new Student();
        user.setFIO("Ivan Dvoeglazov");
        user.setGrup(1);
        user.setData("20.20.2020");
        System.out.println("FIO: " + user.getFIO());
        System.out.println("Grup: " + user.getGrup());
        System.out.println("Data: " + user.getData());
    }
}
