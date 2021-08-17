package ru.job4j.pojo;

public class Student {
    private String FIO;
    private int grup;
    private String data;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGrup() {
        return grup;
    }

    public void setGrup(int grup) {
        this.grup = grup;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}





//2. В модели должны быть поля: ФИО, группа, дата поступления.

//        3. Сгенерируйте аксессоры для этих полей.

  //      4. Создайте класс ru.job4j.pojo.College с методом main
  //      . В методе main создайте объект Student и заполните поля через set.
  //      Добавьте вывод на консоль объекта student через методы get.