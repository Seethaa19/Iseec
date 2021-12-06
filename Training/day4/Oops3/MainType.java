
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainType {

    public static void main(String[] args) {
        int itemTypeCount = 0;
        ItemType[] itemTypeArray = null;
        ItemType itemType = null;
        ItemTypeBo itemTypeBO = null;
        String search = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            itemTypeBO = new ItemTypeBo();

            System.out.println("Enter the Number of Item Type");
            itemTypeCount = Integer.parseInt(bufferedReader.readLine());

            itemTypeArray = new ItemType[itemTypeCount];

            for (int i = 0; i < itemTypeCount; i++) {
                itemType = new ItemType();

                System.out.printf("Enter the Item Type %d Name\n", i + 1);
                itemType.setName(bufferedReader.readLine());

                System.out.println("Enter the Deposit Amount");
                itemType.setDeposit(Double.parseDouble(bufferedReader.readLine()));

                System.out.println("Enter the Cost per day");
                itemType.setCostPerDay(Double.parseDouble(bufferedReader.readLine()));

                itemTypeBO.add(itemType, itemTypeArray, i);
            }

            itemTypeBO.display(itemTypeArray);

            System.out.println("Enter the Name of the item to be searched");
            search = bufferedReader.readLine();

            itemTypeBO.search(search, itemTypeArray);

        } catch (IOException ioException) {
            System.err.println("Error: IO error occurred");
        } catch (NumberFormatException inputMismatchException) {
            System.err.println("Error: Invalid input");
        } catch (Exception exception) {
            System.err.println("Error: An error occurred");
        }

    }

}

