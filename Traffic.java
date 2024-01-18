import java.util.Scanner;

public class Traffic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user input
            System.out.println("Enter a color (Red, Yellow, Green):");
            String color = scanner.nextLine().trim().toLowerCase();

            // Switch statement to determine the action based on the entered color
            switch (color) {
                case "red":
                    System.out.println("Stop");
                    break;

                case "yellow":
                    System.out.println("Get ready");
                    break;

                case "green":
                    System.out.println("Go");
                    break;

                default:
                    System.out.println("Please choose a valid color (Red, Yellow, Green)");
            }
        } finally {
            // Close the scanner in a finally block to ensure it's always closed
            scanner.close();
        }
    }
}
