public class Book implements AccountSystem {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getFee() {
        return price;
    }
    public String toString(){
        return String.format("Book Title: %s%nBook Price:%d%n ",title,price);
    }
}
