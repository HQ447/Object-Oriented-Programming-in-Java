// Product class
class Product {
    private String productID;
    private String productName;
    public int quantity;
    private double price;
    private boolean edible;



    public Product(String productID, String productName, int quantity, double price, boolean edible) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.edible = edible;
    }

    public double getPrice() {
        return edible ? price : (price * 0.17)+price;
    }

    @Override
    public String toString() {
        return String.format("Product ID:%s%nProductName:%s%nProductQuantity:%d%nProduct Price of Each:%f%n", productID,productName,quantity,getPrice());
    }
}

