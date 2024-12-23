import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Instantiating objects for each class
        Doctor doctor = new Doctor(1, "Dr. Smith", "Cardiology", "1234567890", "dr.smith@example.com");
        Patient patient = new Patient(101, "John Doe", "Fever", "9876543210", new Date());
        Receptionist receptionist = new Receptionist(1001, "Alice", new Date(), new Date());
        Checkup checkup = new Checkup(10001, new Date(), new Date(), "Fever", doctor, patient);

        // Displaying initial details
        System.out.println("Initial Checkup Details:");
        System.out.println(checkup);

        // Taking input from user to update patient's name and contact number
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter new patient name: ");
        String newName = scanner.nextLine();
        patient.setName(newName);

        System.out.print("Enter new patient contact number: ");
        String newContactNo = scanner.nextLine();
        patient.setContactNo(newContactNo);
        scanner.close();

        // Displaying updated details
        System.out.println("\nUpdated Checkup Details:");
        System.out.println(checkup);

        // Displaying patient's idNo and name of the doctor
        System.out.println("\nPatient ID: " + patient.getPatientID());
        System.out.println("Doctor's Name: " + doctor.getName());
    }
}
