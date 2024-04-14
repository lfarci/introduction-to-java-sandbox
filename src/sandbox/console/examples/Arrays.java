package sandbox.console.examples;

public class Arrays {
	
	public static void showTemperatures() {
		// Temperatures for April 2024.
		int[] temperatures = new int[30]; // Index from 0 to 29

		temperatures[1] = 15;
		temperatures[15] = 20;
		temperatures[21] = 7;
		
		for (int i = 0; i < temperatures.length; i++) {
			temperatures[i] = 10;
		}

		for (int i = 0; i < temperatures.length; i++) {
			System.out.println(i + " => " + temperatures[i]);
		}
	}
}
