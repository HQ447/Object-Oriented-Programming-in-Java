public class WashroomItems extends HouseHoldItems {
    private String material;
    private boolean isToilet;

    public WashroomItems(String item1Name, double item1purchasePrice,String item2Name, double item2purchasePrice, double shippingCost, String material, boolean isToilet) {
        super(item1Name, item1purchasePrice, item2Name, item2purchasePrice, shippingCost);
        this.material = material;
        this.isToilet = isToilet;
    }

    @Override
    public double calculateCost() {
        return (getItem1Price()+getItem2Price())+getShippingCost();
    }

    @Override
    public String toString(){
        return "\nWashroom Items\n"+super.toString()+"Material of item:"+material+"\nIs it a toilet?"+isToilet+"\nPrice with shipping cost:"+calculateCost();
    }
}
