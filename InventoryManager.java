import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private static Map<String, Integer> inventory = new HashMap<>();

    public  InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();  // Create an instance
        manager.restockItem("Apples", 20);                  // Call instance method
        System.out.println(manager.getInventory());         // Print updated inventory

    }



    public static void restockItem(String itemName, int quantityToAdd) {
        int currentStock = inventory.getOrDefault(itemName, 0);
        inventory.put(itemName, currentStock + quantityToAdd);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}