import java.util.ArrayList;

/**
 * The first part of the code will show case an example of an array that holds 4 exam class grades. 
 * The second part of the code will show case an example of an array list that holds
 * a list of food types.
 */

public class arrays_and_arraylist {

	public static void main(String[] args) 
	{
	//Declare and initialize an array that holds 4 class exam grades. 
		int[] grades = {90,97,100,96};
		
	/**Access and print values from the array. 
	 * Individual elements in an array are accessed by an integer index i, using the notation array[i]
	*/
		System.out.println(grades[2]);
		System.out.println(grades[0]);
		System.out.println(grades[3]);
		{
	//Second part of the which show cases an array list of food types. 
	//Create an array that holds different food types
		ArrayList<String> foodTypes = new ArrayList<>();
	
	//Add values, in this case the food types to the array list
		foodTypes.add("Chinese");
		foodTypes.add("Mexican");
		foodTypes.add("Italian");
		
	//Print food types
		System.out.println(foodTypes);
		
	//To remove a food item:
		foodTypes.remove("Chinese");
		
	//Print new list
		System.out.println(foodTypes);
		
	}

}
}