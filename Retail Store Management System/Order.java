// Order class
import java.util.ArrayList;
import java.util.List;

class Order {
    private static int totalOrders = 0;
    private int orderID;
    private String dateOfOrder;
    private List<Product> products;
    private Customer customer;
    private Employee storeEmplyee;

    public Order(String dateOfOrder, Customer customer,Employee storeEmployee) {
        
        this.orderID = totalOrders;
        totalOrders++;
        this.dateOfOrder = dateOfOrder;
        this.customer=customer;
        this.storeEmplyee=storeEmployee;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products)                      
        {
            //if already exits than increment
            if (p.equals(product)) {                
                p.quantity++;
            }
        }
        products.add(product);                      
    }

    public void removeProduct(Product product) {
        products.remove(product);                        
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.quantity;
        }
        return totalPrice;
    }

    @Override
    public String toString() {

        StringBuilder orderDetails = new StringBuilder();                                   
        orderDetails.append("\nOrder Details\nOrder ID: ").append(orderID).append("\n");
        orderDetails.append("Date of Order: ").append(dateOfOrder).append("\n");
        orderDetails.append("\nProducts:\n");
        for (Product product : products) {
            orderDetails.append("").append(product).append("\n");
        }
        orderDetails.append("Total Price: ").append(calculateTotalPrice()).append("\n" );

        return customer+ orderDetails.toString() + storeEmplyee;
    }
}