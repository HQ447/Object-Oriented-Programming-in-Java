class Buyer implements Finance {
    private String name;
    private String id;
    private String address;
    private String contact;

    // Constructor
    public Buyer(String name, String id, String address, String contact) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public void calculateAmountToPay(Animal animal) {
        double amountToPay = animal.calculateEarning();
        System.out.println("Amount to be paid by the buyer: " + amountToPay);
    }

    @Override
    public double calculateEarning() {
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%nBuyer Details%nName:%s%nID:%s%nAddress:%s%nContact:%s%n",name,id,address,contact);
    }
        
    
}