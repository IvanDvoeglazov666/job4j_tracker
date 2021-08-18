package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book();
        Book two = new Book();
        Book three = new Book();
        Book four = new Book();
        Book[] bibliotek = new Book[4];
        bibliotek[0] = one;
        bibliotek[1] = two;
        bibliotek[2] = three;
        bibliotek[3] = four;
        one.setName("Clean code");
        for(int index = 0; index < bibliotek.length; index++) {
            Book g = bibliotek[index];
                if (index == 0) {
                Book temp = bibliotek[index];
                bibliotek[index] = bibliotek[bibliotek.length - 1];
                bibliotek[index] = bibliotek[index + 1];
                bibliotek[bibliotek.length - 1] = temp;
            }
              System.out.println(bibliotek[index].getName() + " " + bibliotek[index].getPage());

        }

    }
}
