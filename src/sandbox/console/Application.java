package sandbox.console;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Application {
	
	public static void showList(List<Double> prices) {
		for (int i = 0; i < prices.size(); i++) {
			System.out.println(i + " => " + prices.get(i));
		}
		System.out.println();
	}
	
	public static void demoListMethods() {
		// Change of price for a big mac over infinite period of time
		List<Double> prices = new ArrayList<Double>();
			
		prices.add(23.56);
		prices.add(23.56);
		prices.add(12.23);
		prices.add(87.23);
		
		prices.add(0, 45.23);
		
		prices.remove(0); // Remove the element at the given position
		prices.remove(23.56); // Remove the element with the given value
		
		Collection<Double> toBeRemoved = new ArrayList<Double>();
		
		toBeRemoved.add(12.23);
		toBeRemoved.add(87.23);
		
		prices.removeAll(toBeRemoved);
		
		showList(prices);
		
		prices.add(1.0);
		prices.add(2.0);
		prices.add(3.0);
		prices.add(23.56);
		
		showList(prices);
		
		System.out.println(prices.indexOf(23.56));
		System.out.println(prices.lastIndexOf(23.56));
	}
	
	public static void main(String[] args) {
		demoListMethods();
	}
}
