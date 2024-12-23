class Invoice implements Finance {
    private Dealer dealer;
    private Buyer buyer;
    private Animal animal;

    // Constructor
    public Invoice(Dealer dealer, Buyer buyer,Animal animal) {
        this.dealer = dealer;
        this.buyer = buyer;
        this.animal=animal;
    }

    // Method to calculate the total amount to be paid in the invoice
    @Override
    public double calculateEarning() {
        double dealerAmount = dealer.calculateEarning();
        double buyerAmount = buyer.calculateEarning();
        double salesTax = (dealerAmount + buyerAmount) * 0.07;
        double totalAmount = dealerAmount + buyerAmount + salesTax;
        animal.setSold(true);
        return  totalAmount;
    }

    @Override
    public String toString() {
        return "Invoice\n"+dealer+"\n"+buyer+"\n"+animal+"The total amouont "+calculateEarning();
        
    }
}