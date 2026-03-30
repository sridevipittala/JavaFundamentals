/*
Dynamic ArrayList: Grocery Tracker
Create an ArrayList<String> called groceryList.
Add 5 different items to the list (e.g., "Apples", "Bread", "Milk", "Eggs", "Coffee").
Remove one item from the list using its name (e.g., remove("Bread")).
Check if a specific item is in the list using the .contains() method and print a message based on the result (e.g., "Milk is on the list!").
Print the total number of items currently in the list using .size().
Finally, print all the items in the list using an enhanced for loop (for-each loop).
*/
import java.util.ArrayList;

class GroceryTracker{
	public static void main(String args[]){
		ArrayList<String> groceryList=new ArrayList<>();
		groceryList.add("Apples");
		groceryList.add("Bread");
		groceryList.add("Milk");
		groceryList.add("Eggs");
		groceryList.add("Coffee");

		groceryList.remove("Bread");

		if(groceryList.contains("Bread")){
			System.out.println("Milk is on the list!");
		}
		System.out.println("Total number of items currently in the list: "+groceryList.size());

		for(String item:groceryList){
			System.out.println(item);
		}
	}
}