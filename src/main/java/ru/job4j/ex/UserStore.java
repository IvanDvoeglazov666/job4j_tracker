package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User res = new User("f",false);
        for(int index = 0; index < users.length; index++) {
            if(users[index].getUsername().equals(login)) {
                res = users[index];
            }
        }
        if (res.getUsername() != login) {
            throw new UserNotFoundException("No user");
        }

        return res;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean res = false;
        if(user.getUsername().length() > 3) {
            res = true;
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("at least three characters");
        }
        return res;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException an) {
            an.printStackTrace();
        }





    }
}
