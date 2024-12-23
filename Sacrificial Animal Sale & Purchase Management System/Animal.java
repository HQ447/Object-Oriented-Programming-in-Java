import java.util.Date;
class Animal implements Finance {
    private String type;
    private String tagID;
    private String color;
    private double weight;
    private double pricePerKg;
    private Date arrivalDate;
    private double serviceCharges;
    private boolean isSold;

    // Constructor
    public Animal(String type, String tagID, String color, double weight, double pricePerKg,
                  Date arrivalDate, double serviceCharges) {
        this.type = type;
        this.tagID = tagID;
        this.color = color;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
        this.arrivalDate = arrivalDate;
        this.serviceCharges = serviceCharges;
        this.isSold = false;
    }

    @Override
    public double calculateEarning() {
        double totalPrice = weight * pricePerKg;
        return totalPrice + serviceCharges;
    }

    void setSold(boolean isSold) {
        this.isSold = isSold;
    }

    String getTagID() {
        return tagID;
    }

    @Override
    public String toString() {
        return String.format("%nAnimal Details%nTagID:%s%nType:%s%nColor:%s%nWeight:%f%nPrice:%f%n", tagID,type,color,weight,pricePerKg);
    }
}