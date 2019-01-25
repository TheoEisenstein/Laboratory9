package laboratory9eisenstein;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Laboratory9Eisenstein {
	
	
	
	
	private static Map<String, Double> menu = new HashMap<>();

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
	
		//Map created. No creativity.
		System.out.println("Menu of GOOD FOOD at GREAT PRICES");
		System.out.println("=================================");
		populateMenu();
		printMenu();
			
			
			System.out.println("Would you like to order an item?");
			
		String listedCart;
			System.out.println(listCart()+ populateMenu(menu.get(listedCart)));
	
			
			
			
			
			//ArrayList<String> listCartPrices = ArrayList<>();
			
			
			
			
			//String[] cartItems = new String[petCount];
			//System.out.println(Arrays.toString(pets));
			
			
			
			
			
			
	
	}
	private static String listCart() {
		Scanner scnr2 = new Scanner(System.in);
			String input = scnr2.next();
		return input;
	}
	
	private static void populateMenu() {
		menu.put("apple", 0.99);
		menu.put("banana",  0.59);
		menu.put("cauliflower", 1.59);
		menu.put("dragonfruit", 2.19);
		menu.put("elderberry", 1.79);
		menu.put("figs", 2.09);
		menu.put("grapefruit", 1.99);
		menu.put("honeydew", 3.49);
	}
	private static void printMenu() {
		for (String name : menu.keySet()) {
			System.out.println(name + "\t" + menu.get(name));
			}
		}
	
	
	
	private static String orderItem(Scanner scnr, String input) {
		do {
			System.out.println("Please enter an item you would which to purchase.");
			input = scnr.nextLine();
		boolean valid = input.matches("[A-Z]+[a-z]");
				System.out.println(valid ? "Adding+ " + input + "to order." : "Could you repeat that?");
	}while(!input.matches("[A-Z]+[a-z]"));
		return input;
	}
	

		
	}
	



	
	
		



