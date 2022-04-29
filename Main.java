class Main {
    public static void main(String[] args) {
      Inventory inventory = new Inventory();
      inventory.createItem("a");
      inventory.createItem("b");
      inventory.createItem("c");
      System.out.println("Current inventory has: " + inventory.viewInventory()); // should get a b c
      inventory.editItem("a", "new_a");
      System.out.println("Current inventory has: " + inventory.viewInventory()); // should get new_a b c
      inventory.deleteItem("c","");
      System.out.println("Current inventory has: " + inventory.viewInventory()); // should get new_a b
      String deletionComment = inventory.deleteItem("new_a","new_a deleted");
      System.out.println("Current inventory has: " + inventory.viewInventory()); // should get b
      System.out.println("Deletion comment is: " + deletionComment);
      inventory.undeleteItem();
      System.out.println("Current inventory has: " + inventory.viewInventory()); // should get new_a b
    }
  }