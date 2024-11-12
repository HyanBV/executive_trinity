// Imported Scanner.
import java.util.Scanner;

// Global: renamed variables to follow best practices: sense & camelCase
public class Codigo6 {
	public static void main(String[] args) {
        // Initialize the array of 20 numbers
        int[] numbers = new int[20];

        // Generate random numbers between 20 and 400
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int)(Math.random() * 381) + 20;
            System.out.print(numbers[i] + " ");
        }

        // Ask user for the type of multiples to highlight
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int option = scanner.nextInt();

        // Determine which multiple to highlight (5 or 7)
        int multiple = (option == 1) ? 5 : 7;

        // Print numbers with highlighting
        System.out.println("\nNúmeros resaltados:");
        for (int num : numbers) {
        	// Modulo Operator
            if (num % multiple == 0) {
                System.out.print("[" + num + "] ");
            } else {
                System.out.print(num + " ");
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}