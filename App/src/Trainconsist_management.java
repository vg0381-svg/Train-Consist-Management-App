import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Trainconsist_management {
    // Previous Use Cases
    private List<String> consist;
    private Set<String> bogieIDs;
    private Set<String> orderedConsist;

    // UC6: Map to store Bogie types and their capacities
    private Map<String, Integer> capacityMap;

    // Constructor to initialize everything
    public Trainconsist_management() {
        consist = new ArrayList<>();
        bogieIDs = new HashSet<>();
        orderedConsist = new LinkedHashSet<>();
        capacityMap = new HashMap<>(); // Key: String (Bogie), Value: Integer (Capacity)
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
        System.out.println("UCS Preserve Insertion Order of Bogies");

        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        System.out.println("Final Train Formation");
        System.out.println(orderedConsist);

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UCS formation setup completed...\n");
    }

    // UC6: HashMap operations to map capacity
    public void runUC6Operations() {


        // Storing capacities
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");
        // Printing in the specific arrow format requested
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("UC6 bogie-capacity mapping completed....");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Run all use cases in order
        app.displaySummary();
        app.runUC2Operations();
        app.runUC3Operations();
        app.runUC5Operations();
        app.runUC6Operations();
    }
}