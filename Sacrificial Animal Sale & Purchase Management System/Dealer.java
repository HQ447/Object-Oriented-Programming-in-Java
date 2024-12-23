import java.util.ArrayList;

class Dealer implements Finance {
    private String name;
    private String id;
    private String address;
    private String phoneNumber;
    private double commissionRate;
    private ArrayList<Animal> animals;

    // Constructor
    public Dealer(String name, String id, String address, String phoneNumber, double commissionRate) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.commissionRate = commissionRate;
        this.animals = new ArrayList<>();
    }

    @Override
    public double calculateEarning() {
        double totalCommission = 0;
        for (Animal animal : animals) {
            totalCommission += animal.calculateEarning() * commissionRate / 100;
        }
        return totalCommission;
    }

    // Method to add an animal to the dealer's collection
    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    // Method to check if the dealer has a specific animal
    public boolean contains(String tagID) {
        for (Animal animal : animals) {
            if (animal.getTagID().equals(tagID)) {
                return true;
            }
        }
        return false;
    }

    // Method to remove an animal from the dealer's collection
    public void removeAnimal(String tagID) {
        for (Animal animal : animals) {
            if (animal.getTagID().equals(tagID)) {
                animal.setSold(true);
                animals.remove(animal);
                break;
            }
        }
    }

    // Method to get all animal objects for the dealer
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    double getCommissionRate() {
        return commissionRate;
    }

    void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Dealer Details%nName:%s%nID:%s%nAddress:%s%nContact:%s%nCommission Rate:%f%nAnimals:", name,id,address,phoneNumber,commissionRate,animals);
        
    }
}