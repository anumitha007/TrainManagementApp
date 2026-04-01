import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}