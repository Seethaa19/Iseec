import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainU {
    public static void main(String[] args) {
        int usersCount = 0;
        User[] usersArray = null;
        User user = null;
        UserBO userBO = null;
        String userToBeDeleted = null;
        boolean isUserDeleted = false;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            userBO = new UserBO();

            System.out.println("Enter the number of users");
            usersCount = Integer.parseInt(bufferedReader.readLine());

            usersArray = new User[usersCount];

            for (int i = 0; i < usersCount; i++) {
                user = new User();

                System.out.printf("Enter the details of User %d\n", i + 1);
                System.out.println("Enter the name of the user:");
                user.setName(bufferedReader.readLine());

                System.out.println("Enter the mobile number of the user:");
                user.setMobileNumber(bufferedReader.readLine());

                System.out.println("Enter the username of the user:");
                user.setUsername(bufferedReader.readLine());

                System.out.println("Enter the password of the user:");
                user.setPassword(bufferedReader.readLine());

                userBO.addUser(usersArray, user);
            }

            System.out.println("User details as entered:");
            userBO.displayAll(usersArray);

            userBO.sortUsers(usersArray);

            System.out.println("After sorting:");
            userBO.displayAll(usersArray);

            System.out.println("Enter the user to be deleted:");
            userToBeDeleted = bufferedReader.readLine();

            isUserDeleted = userBO.deleteUser(usersArray, userToBeDeleted);

            if (isUserDeleted) {
                System.out.println("User deleted successfully");
                System.out.println("After Deleting:");
                userBO.displayAll(usersArray);
            } else {
                System.out.println("No user found with given name");
            }

        } catch (IOException ioException) {
            System.err.println("Error: IO error occurred");
        } catch (Exception exception) {
            System.err.println("Error: An error occurred");
        }
    }
}
