import java.util.Scanner;

public class DecisionFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Did someone do a thing? Are they on our side? (yes/no): ");
        String side = scanner.nextLine().toLowerCase();

        if (side.equals("no")) {
            System.out.println("BASTARD");
        } else if (side.equals("yes")) {
            System.out.println("it's fine");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
