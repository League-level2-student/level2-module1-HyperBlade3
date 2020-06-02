package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		
		//2. Add five Strings to your list
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		array.add("E");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));
		}
		System.out.println();
		
		//4. Print all the Strings using a for-each loop
		for (String x: array) {
			System.out.print(x);
		}
		System.out.println();
		
		//5. Print only the even numbered elements in the list.
		
		for (int i = 0; i < array.size(); i++) {
			if (i%2==0) {
				System.out.print(array.get(i));
			}
		}
		System.out.println();
		
		//6. Print all the Strings in reverse order.
		
		for (int i = array.size() -1; i >= 0; i--) {
			System.out.print(array.get(i));
		}
		System.out.println();
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (String x : array) {
			if (x.contains("e")) {
				System.out.print(x);
			}
				
			
		}
		System.out.println();
	}
}
