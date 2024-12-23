class Seller implements Finance {
    private String name;
    private String id;
    private String address;
    private String contact;
    private double profitRate;
    private double salesTaxRate;

    // Constructor
    public Seller(String name, String id, String address, String contact, double profitRate, double salesTaxRate) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.contact = contact;
        this.profitRate = profitRate;
        this.salesTaxRate = salesTaxRate;
    }

    // Method to calculate the sales tax on the profit and after-tax profit of the seller
    public void calculateProfit(Animal animal) {
        double profit = animal.calculateEarning() * profitRate / 100;
        double salesTax = profit * salesTaxRate / 100;
        System.out.println("Profit earned by the seller: " + profit);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("After Tax Profit: " + (profit - salesTax));
    }

    @Override
    public double calculateEarning() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%nSeller Details%nName:%s%nID:%s%nAddress:%s%nContact:%s%nProfit Rate:%f%nSales Tax Rate:%f%n", name,id,address,contact,profitRate,salesTaxRate);
    }
}
