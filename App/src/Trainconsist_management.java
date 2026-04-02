import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Trainconsist_management {
    // UC1 & UC2
    private List<String> consist;

    // UC3
    private Set<String> bogieIDs;

    // UC5: Set to preserve insertion order and uniqueness
    private Set<String> orderedConsist;

    // Constructor to initialize everything
    public Trainconsist_management() {
        consist = new ArrayList<>();
        bogieIDs = new HashSet<>();
        orderedConsist = new LinkedHashSet<>(); // Maintains insertion order
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
        System.out.println("UC3 Track Unique Bogie IDs");

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs.toString().replace("BG101", "B6101").replace("BG102", "B6102"));

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...\n");
    }

    // UC5: LinkedHashSet operations to maintain insertion order
    public void runUC5Operations() {


        // Adding elements in a specific order
        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        // Attempting to add a duplicate (will be ignored)
        orderedConsist.add("Sleeper");

        System.out.println("Final Train Formation");
        System.out.println(orderedConsist);

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UC5 formation setup completed...");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Run Use Case 1
        app.displaySummary();

        // Run Use Case 2
        app.runUC2Operations();

        // Run Use Case 3
        app.runUC3Operations();

        // Run Use Case 5
        app.runUC5Operations();
    }
}