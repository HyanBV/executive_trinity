// Global Changes: Modified variable names to follow best practices: sense & camelCase.
// Added Scanner Import.
import java.util.Scanner;
public class Codigo5 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        // Modified sys out method to properly ask for input.
	    System.out.print("Introduzca un número: ");
	    String input = scanner.nextLine();
	    
	    // Added a try-cacth method to handle undesired input.
	    try {
	    	int number = Integer.parseInt(input);
	    	
            // Fixed if statement to properly handle "Lucky" method.
	    	if (isLucky(number)) {
	    		System.out.println("El " + number + " es un número afortunado.");
	    	} else {
	    		System.out.println("El " + number + " no es un número afortunado.");
	    	}
	    } catch (NumberFormatException e) {
	    	System.out.println("Por favor, introduzca un número válido");
	    // Finally method to close scanner.
	    } finally {
	    	scanner.close();
	    }
	}
	
	// static boolean method to handle the Lucky method
	public static boolean isLucky(int number) {
		int luckyCount = 0;
		int unluckyCount = 0;
		
		while (number > 0) {
			int digit = number % 10;
			
			if (digit == 3 || digit == 7 || digit == 8 || digit == 9) {
				luckyCount++;
			} else {
				unluckyCount++;
			}
			
			number /= 10;
		}
		
		return luckyCount > unluckyCount;
	}
}