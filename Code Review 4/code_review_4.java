// Added import statement to import Scanner.
import java.util.Scanner;

// Global: renamed some variables to better focus on best practices.

public class Codigo4 {

	public static void main(String[] args) {
		// Created Object scanner for user input.
		Scanner scanner = new Scanner(System.in);
		
		// Ask and read plays made by both players.
		System.out.println("Turno del jugador 1 (introduzca piedra, papel, o tijera): ");
		String j1 = scanner.nextLine().toLowerCase().trim();
		
		System.out.println("Turno del jugador 2 (introduzca piedra, papel, o tijera): ");
		String j2 = scanner.nextLine().toLowerCase().trim();
		
		
		// Validate entries.
		if (!isValidChoice(j1) || !isValidChoice(j2)) {
			System.out.println("Entrada no válida. Asegúrese de que la jugada sea 'piedra', 'papel' o 'tijeras'. ");
		} else {
			int winner = determineWinner(j1, j2);
				System.out.println("Gana el jugador " + winner);
		}
		scanner.close();
	}
	
	// Method to validate entries.
	private static boolean isValidChoice(String choice) {
		return choice.equals("piedra") || choice.equals("papel") || choice.equals("tijeras");
	}
	
	// Method to determine the winner.
	private static int determineWinner(String j1, String j2) {
		// Create a switch to determine the winner.
		switch (j1) {
		case "piedra":
			return (j2.equals("tijeras")) ? 1 : 2;
		case "papel":
			return (j2.equals("tijeras")) ? 1 : 2;
		case "tijeras":
			return (j2.equals("tijeras")) ? 1 : 2;
		default:
			return 0; // This would never happen because of the previous entries.
		} 
	}

}