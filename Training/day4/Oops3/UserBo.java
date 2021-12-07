import java.util.Arrays;

public class UserBO {
    public void addUser(User[] userArray, User userIns) {
        int lastIndex = 0;

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == null) {
                lastIndex = i;
                break;
            }
        }

        userArray[lastIndex] = userIns;
    }

    public void sortUsers(User[] userArray) {
        Arrays.sort(userArray);
    }

    public Boolean deleteUser(User[] userArray, String name) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].getName()
                    .equals(name)) {
                userArray[i] = null;
                return true;
            }
        }

        return false;
    }

    public void displayAll(User[] userArray) {
        System.out.println("User Details:");

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] != null) {
                System.out.printf("User %d\n", i + 1);
                System.out.println(userArray[i]);
            }
        }
    }
}
