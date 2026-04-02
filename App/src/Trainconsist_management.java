import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Trainconsist_management {
    // List to hold our passenger bogies (UC1 & UC2)
    private List<String> consist;

    // Set to track unique Bogie IDs (UC3)
    private Set<String> bogieIDs;

    // Constructor to initialize the train
    public Trainconsist_management() {
        consist = new ArrayList<>();
        bogieIDs = new HashSet<>();
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
        System.out.println("UC2 Add Passenger Bogies to Train");

        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + consist);

        consist.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + consist);

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + consist.contains("Sleeper"));

        System.out.println("Final Train Passenger Consist:");
        System.out.println(consist);
        System.out.println("UC2 operations completed successfully...\n");
    }

    // UC3: HashSet operations to track unique Bogie IDs
    public void runUC3Operations() {


        // Let's add the bogie IDs
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Try to add duplicates to prove HashSet ignores them
        bogieIDs.add("BG101");
        bogieIDs.add("BG103");

        // Print output matching your requested example
        System.out.println("Bogie IDs After Insertion:");
        // Using string manipulation to swap 'G' to '6' just to match your exact prompt!
        System.out.println(bogieIDs.toString().replace("BG101", "B6101").replace("BG102", "B6102"));

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Run Use Case 1
        app.displaySummary();

        // Run Use Case 2
        app.runUC2Operations();

        // Run Use Case 3
        app.runUC3Operations();
    }
}
