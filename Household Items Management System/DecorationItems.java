public class DecorationItems extends HouseHoldItems {
    private String color;
    private String pattern;

    public DecorationItems(String item1Name, double item1purchasePrice, String item2Name, double item2purchasePrice, double shippingCost, String color, String pattern) {
       super(item1Name,item1purchasePrice, item2Name, item2purchasePrice, shippingCost);
        this.color = color;
        this.pattern = pattern;
    }

    // Implement the abstract method
    @Override
    public double calculateCost() {
        return getItem1Price()+getItem2Price()+getShippingCost();
    }

    @Override
    public String toString(){
        return "\nDecoration Items\n"+super.toString()+"Color of item:"+color+"\nPattern of Items:"+pattern+"\nTotal Price with shipping cost:"+calculateCost();
    }

    // Additional methods and overrides as needed
}
