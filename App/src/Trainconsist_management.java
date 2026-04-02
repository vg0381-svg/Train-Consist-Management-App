import java.util.ArrayList;
import java.util.List;

public class Trainconsist_management {
    // List to hold our passenger bogies
    private List<String> consist;

    // Constructor to initialize the train
    public Trainconsist_management() {
        consist = new ArrayList<>();
    }

    // UC1: Method to display the train summary
    public void displaySummary() {
        System.out.println("===Train Consist Management App ===");
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + consist.size());
        System.out.println("Current Train Consist: " + consist);
        System.out.println("System ready for operations...\n");
    }

    // UC2: Operations to add, remove, and check bogies
    public void runUC2Operations() {


        // 1. Adding Bogies
        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + consist);

        // 2. Removing 'AC Chair'
        consist.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + consist);

        // 3. Checking if 'Sleeper' exists
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + consist.contains("Sleeper"));

        // 4. Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(consist);
        System.out.println("UC2 operations completed successfully...");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Run Use Case 1
        app.displaySummary();

        // Run Use Case 2
        app.runUC2Operations();
    }
}
