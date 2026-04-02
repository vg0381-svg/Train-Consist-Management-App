import java.util.ArrayList;
import java.util.List;

public class Trainconsist_management {
    // A list to hold our bogies (carriages/wagons)
    private List<String> consist;
    public Trainconsist_management() {
        consist = new ArrayList<>();
    }

    // Method to display the train summary
    public void displaySummary() {
        System.out.println("===Train Consist Management App ===");
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + consist.size());
        System.out.println("Current Train Consist: " + consist);
        System.out.println("System ready for operations...");
    }

    public static void main(String[] args) {
        Trainconsist_management app = new Trainconsist_management();

        app.displaySummary();
    }
}
