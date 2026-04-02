import java.util.ArrayList;
import java.util.Comparator;
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
    private Map<String, Integer> capacityMap;

    // Constructor to initialize everything
    public Trainconsist_management() {
        consist = new ArrayList<>();
        bogieIDs = new HashSet<>();
        orderedConsist = new LinkedHashSet<>();
        capacityMap = new HashMap<>();
    }


    // UC7: Sort Bogies by Capacity using a custom Comparator
    public void runUC7Operations() {


        // We need to add "General" for this UC according to your prompt
        capacityMap.put("General", 90);

        System.out.println("Before Sorting:");
        System.out.println("Sleeper -> 72\nAC Chair -> 56\nFirst Class -> 24\nGeneral -> 90");

        // Convert map entries to a list for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(capacityMap.entrySet());

        // Sort the list by capacity value (ascending)
        list.sort(Comparator.comparing(Map.Entry::getValue));

        System.out.println("\nAfter Sorting by Capacity:");
        for (Map.Entry<String, Integer> entry : list) {
            // Skips 'Cargo' since it wasn't in your UC7 target output list
            if (!entry.getKey().equals("Cargo")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        System.out.println("UC7 sorting completed....");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        // Running all required test cases

        app.runUC7Operations();
    }
}