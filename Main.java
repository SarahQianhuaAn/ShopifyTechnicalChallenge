class Main {
    public static void main(String[] args) {
      Inventory inventory = new Inventory();
      inventory.createItem("a");
      inventory.createItem("b");
      inventory.createItem("c");
      String itemString = inventory.viewInventory();
      System.out.println("Current inventory has:" + itemString); // should get a b c
      inventory.editItem("a", "new_a");
      itemString = inventory.viewInventory();
      System.out.println("Current inventory has:" + itemString); // should get new_a b c
      inventory.deleteItem("c");
      System.out.println("Current inventory has:" + itemString); // should get new_a b
    }
  }