public class Item{
    // a class for inventory items

    // a data attribute that represents the item's name
    public String name;

    // construct an item with name
    public Item(String name){
        this.name = name;
    }

    // change the item's name to newName
    public void edit(String newName){
        this.name = newName;
    }
}