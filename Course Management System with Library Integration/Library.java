import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private double membershipFee;

    public Library() {
        books = new ArrayList<>();
        membershipFee = 0.0;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setMembershipFee(double fee) {
        membershipFee = fee;
    }

    public String toString(){
        return String.format("Books:%nMemberShip Fee",books,membershipFee);
    }
}
