public class KitchenItems extends HouseHoldItems {
    private boolean isElectric;

    public KitchenItems(String item1Name, double item1purchasePrice, String item2Name, double item2purchasePrice, double shippingCost, boolean electric) {
    super(item1Name, item1purchasePrice, item2Name, item2purchasePrice, shippingCost);
        this.isElectric = electric;
    }

    @Override
    public double calculateCost() {
        return (getItem1Price()+getItem2Price())+getShippingCost();
    }

    @Override
    public String toString(){
        return "\nKitchen Items\n"+super.toString()+"Is it Electric item? "+isElectric+"\nPrice with shipping cost:"+calculateCost()+"\n";
}
}