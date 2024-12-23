public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return String.format("Person Name: %s%nPerson Address: %s%n",name,address);
    }
}
