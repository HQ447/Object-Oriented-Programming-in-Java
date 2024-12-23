import java.util.Date;

public class testClass{
    public static void main(String[] args) {
        // Create objects for all the classes
        Animal cow = new Animal("Cow", "Cow123", "Brown", 80, 650, new Date(), 200);
        Dealer dealer = new Dealer("dealer name", "dealer123", "Kohat", "0345-2984567", 5);
        Seller seller = new Seller("seller name", "seller123", "Kohat", "0345-2984567", 10, 17);
        Buyer buyer = new Buyer("buyer name", "buyer123", "Kohat", "0345-2984567");
        Invoice invoice = new Invoice(dealer, buyer,cow);

        dealer.addAnimal(cow);

        System.out.println(invoice);

        dealer.setCommissionRate(dealer.getCommissionRate() - 2);
        System.out.println("Discounted Commission Rate: " + dealer.getCommissionRate());    
    }
  

}