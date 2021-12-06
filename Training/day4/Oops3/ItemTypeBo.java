public class ItemTypeBo {
    public void add(ItemType object, ItemType[] itemTypeArray, Integer index) {
        itemTypeArray[index] = object;
        System.out.println("New item added successfully");
    }

    public void search(String search, ItemType[] itemTypeArray) {
        boolean isFound = false;

        for (ItemType item : itemTypeArray) {
            if (item.getName()
                    .equals(search)) {
                isFound = true;
                System.out.println("Searched Item Type is:");
                System.out.println(item);

            }
        }

        if (!isFound) {
            System.out.println("Searched Item Type not found");
        }
    }

    public void display(ItemType[] itemTypeArray) {
        for (int i = 0; i < itemTypeArray.length; i++) {
            System.out.printf("Item Type Number %d:\n", i + 1);
            System.out.println(itemTypeArray[i]);
        }
    }
}

