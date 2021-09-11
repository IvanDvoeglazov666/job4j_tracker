package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User res = null;
        for(User index: users) {
            if(index.getUsername().equals(login)) {
                res = index;
                break;
            }
        }
        if (res.getUsername() != null) {
            throw new UserNotFoundException("No user");
        }

        return res;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean res = true;
        if((!user.isValid() || user.getUsername().length() < 3)) {
            res = false;
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
