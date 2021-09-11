package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
           if(value[i].equals(key)) {
               rsl = i;
               break;
           }
        }
        if (rsl == -1) {
            throw new UserInputException("no data returned");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] num = {"vanya", "petya", "vasya"};
        String key = "petya";
        try {
            System.out.println(FindEl.indexOf(num,key));
        } catch (UserInputException e) {
            e.printStackTrace();
        }


    }
}
