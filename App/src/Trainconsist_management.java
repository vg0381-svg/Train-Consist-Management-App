import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Trainconsist_management {
    // Previous Use Cases
    private List<String> consist;
    private Set<String> bogieIDs;
    private Set<String> orderedConsist;
    private Map<String, Integer> capacityMap;

    // Constructor to initialize everything
    public Trainconsist_management() {
        consist = new ArrayList<>();
        bogieIDs = new HashSet<>();
        orderedConsist = new LinkedHashSet<>();
        capacityMap = new HashMap<>();
    }



    // UC4: Positional operations (using LinkedList to behave like your requested output)
    public void runUC4Operations() {
        System.out.println("UC4 Maintain Ordered Bogie Consist");

        // Using a LinkedList to easily add to the middle and remove ends
        LinkedList<String> positionConsist = new LinkedList<>();
        positionConsist.add("Engine");
        positionConsist.add("Sleeper");
        positionConsist.add("AC");
        positionConsist.add("Cargo");
        positionConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(positionConsist);

        // Inserting 'Pantry Car' at index 2
        positionConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(positionConsist);

        // Removing the First and Last Bogies
        positionConsist.removeFirst(); // Removes Engine
        positionConsist.removeLast();  // Removes Guard

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(positionConsist);

        System.out.println("UC4 ordered consist operations completed...\n");
    }




    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Running all 6 required use cases in logical order

        app.runUC4Operations(); // Added UC4 here!

    }
}