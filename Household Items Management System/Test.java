// TestHouseholdItems.java
public class Test {
    public static void main(String[] args) {
        DecorationItems d = new DecorationItems("lamp", 800.0, "candle", 155.0, 100.0, "Red", "Striped");
        WashroomItems w = new WashroomItems("towel", 300.0, "shampoo", 250.0, 100.0, "soft", false);
        KitchenItems k = new KitchenItems("microwave", 18000.0, "Blender", 9900.0, 300.0, true);

        
        System.out.println(d);
        System.out.println(w);
        System.out.println(k);

        // Identify KitchenItem and increase the price by 10%
        HouseHoldItems[] items = { d, w, k };
        for (HouseHoldItems item : items) {
            if (item instanceof KitchenItems) {
                KitchenItems kitchenItem = (KitchenItems) item;
                kitchenItem.increasePriceByPercentage(10);
            }
        }

        // Display the details after the price increase
        System.out.println("\nNew Prices of Kitchen items with 10% increases:\n");
        System.out.println(k);
    }



    }