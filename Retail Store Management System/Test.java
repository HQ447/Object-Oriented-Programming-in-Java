// Test class
public class Test {
    public static void main(String[] args) 
    {
        Customer customer=new Customer("01","Hammad","kohat","hamad@gmail.com");
        Employee employee = new Employee("EM001", "Owais Ahmad", "Kohat", "3474534543", "Qowais@gmail.com", "Cashier",44);
     

        //Edible : no tax will be added with that product
        Product product = new Product("P001", "Chocolate",5,120.3, true);
        
        //NonEdible : Price+tax
        Product product1 = new Product("P002", "Book",2,200, false);


        Order order = new Order("2023-11-25",customer, employee);
        order.addProduct(product);
        order.addProduct(product1);
        System.out.println(order);

    }
}