import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // Polymorphically display objects
        List<AccountSystem> accounts = new ArrayList<>();
        accounts.add(new Student("John Doe", 5000.0));
        accounts.add(new Staff("Jane Smith", 60000.0));

        for (AccountSystem account : accounts) {
            System.out.println(account.getFee());
        }

        // Downcasting for Book
        AccountSystem bookAccount = new Book("Sample Book", 25.0);
        if (bookAccount instanceof Book) {
            Book book = (Book) bookAccount;
            // book.setMembershipFee(0.0);
            System.out.println("Books are Donated!");
        }
    }
}
