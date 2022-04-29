import java.util.ArrayList;

public class Inventory{
    // a class for an inventory tracking web application

    // an ArrayList data attribute that represents the list of inventory items
    private ArrayList<Item> inventory;

    private Item deletedItem;
    private int deletedItemNum;

    // construct an empty inventory
    public Inventory(){
        this.inventory = new ArrayList<Item>();
    }

    // create a new item for the inventory list
    public void createItem(String name){
        Item newItem = new Item(name);
        inventory.add(newItem);
    }

    // edit an item based on its name
    public void editItem(String oldName, String newName){
        for(Item item : inventory) {
            if (item.name.equals(oldName)){
                item.edit(newName);
                break;
            }
        }
    }

    // delete an item based on its name
    public String deleteItem(String itemName, String comment){
        for(int itemNum = 0; itemNum < inventory.size(); itemNum++) {
            if (inventory.get(itemNum).name.equals(itemName)){
                deletedItem = inventory.get(itemNum);
                deletedItemNum = itemNum;
                inventory.remove(itemNum);
                break;
            }
        }
        return comment;
    }

    public void undeleteItem(){
        inventory.add(deletedItemNum, deletedItem);
    }

    // return a string that contains the list of items in the inventory
    public String viewInventory(){
        String items = "";
        for (Item item : inventory){
            items += item.name + " ";
        }
        return items;
    }
}