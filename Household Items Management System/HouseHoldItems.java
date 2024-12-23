
public abstract class HouseHoldItems {
    private String item1Name;
    private double item1purchasePrice;
    private String item2Name;
    private double item2purchasePrice;
    private double shippingCost;


    public HouseHoldItems(String itemName,double price,String item2Name , double item2price , double shippingCost){
        this.item1Name=itemName;
        this.item1purchasePrice=price;
        this.item2Name=item2Name;
        this.item2purchasePrice=item2price;
        this.shippingCost=shippingCost;

    }

    
    public double getItem1Price(){
        return item1purchasePrice;
    }

    public double getItem2Price(){
        return item2purchasePrice;
    }
    public double getShippingCost(){
        return shippingCost;
    }
    
    public abstract double calculateCost();

    public void increasePriceByPercentage(double percentage) {
        double newPrice1 = getItem1Price() * (1 + percentage / 100);
        double newPrice2 = getItem2Price() * (1 + percentage / 100);
        item1purchasePrice = newPrice1;
        item2purchasePrice = newPrice2;
    }


    public  String toString(){
        return String.format("Item 1 Name: %s%nItem 1 Price:%f%nItem 2 Name:%s%nItem 2 Price: %f%nShipping Price:%f%n",item1Name,item1purchasePrice,item2Name,item2purchasePrice,shippingCost);
    };
}