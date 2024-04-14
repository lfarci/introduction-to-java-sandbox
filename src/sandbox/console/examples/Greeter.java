package sandbox.console.examples;

import java.util.Scanner;

/**
 * Here you can find a few basic examples
 * of interactions with an user.
 * 
 * It includes reading text from the command
 * line and writing to the screen.
 */
public class Greeter {

	public static String askName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hi, what is your name: ");
		
		return scanner.nextLine();
	}
	
	public static void greet(String name) {
		System.out.println("Hi " + name + ", nice to meet you.");
	}
	
	public static void greetAndExit() {
		String name = askName();
		
		if (name.length() == 0) {
			System.out.println("Please give me your name.");
		}
		else
		{
			greet(name);
		}	
	}
	
	public static void askNameToxically() {
		String name = askName();
		
		while (name.length() == 0) {
			name = askName();
		}
		
		greet(name);
	}
}
