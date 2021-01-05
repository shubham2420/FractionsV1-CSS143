//Can you complete this without using arrays? What is the least number of variables you can use to solve this problem?
//Ans. You have to use some type of array as I used an arraylist. The least number of variables i can use to solve this problem 
// is around 5 because you need to define an array and a method to keep the count of the fractions.
//Can you use just one array to solve this? What would the data type be of that array?
//Ans. You can use one array to solve this and the data type of the array would be a String
//What does it mean to make a class so another class is inside (or part of) the first class, so that it is composed of other data types?  What does "composition" mean in that case?  How is it done?
//Ans.It means that you are nesting your classes and it provides encapsulation of the class. It keeps the classes private so only a specific class can access the other class. 
//Composition means to combine data of different types into more complex ones for the logical flow and structure of the program.  
//What are some solutions to the reduction problem other than Euclid's GCD algorithm?
//Ans. Some other solutions to the reduction problem  other than Euclids algorithm
//is to take the smaller number of the numerator and denominator and run through all those numbers in a for loop which uses an if statement to determine if both the remainder of the numerator and denominator equal zero.

import java.io.*;
import java.util.*;
public class FractionsV1 {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new FileInputStream ("fractions.txt")); // Creates a scanner object that reads the file
			
		}
		catch (IOException e) {
			System.out.println("File not Found");
		}
		ArrayList <String> myList = new ArrayList<String>(); // makes an arraylist for fractions
		while(scan.hasNextLine()) {
			myList.add(reduction(scan.nextLine())); // reduces fractions and adds it into the list
		}
		HashMap finalList=compare(myList); // returns the hashmap with fractions and their occurrences 
		Iterator it=finalList.keySet().iterator();
		while (it.hasNext()) { // prints out the values of the hashmap
			Object myKey=it.next();
			Object myValue=finalList.get(myKey);
			System.out.println(myKey+" has a count of "+myValue);
		}
	}
	
	public static String reduction(String input) {
		String[] temp = input.split("/"); // splits the fractions into two parts 
	        int num = Integer.parseInt(temp[0]);
	        int denom = Integer.parseInt(temp[1]);
	        int gcd = 1;
	        for(int i = 1; i <= num && i <= denom; i++) // finds the greatest common factor 
	        {
	            if(num%i==0 && denom%i==0)
	                gcd = i;
	        }
	        if (gcd != 1) {
	            num /= gcd;
	            denom /= gcd;
	        }
	        return num + "/" + denom;
	 }
	
	public static HashMap<String, Integer> compare(ArrayList<String> input) {
		HashMap<String, Integer> fraction_count=new HashMap<String, Integer>();
		for(int i = 0; i < input.size()-1; i++) { // cycle through the fractions to find occurences
			String myKey=input.get(i);
			Integer myValue=null;
			if (fraction_count.get(myKey)==null) { //if fraction is not in hashmap adds the value
				myValue=new Integer(1);
				fraction_count.put(myKey,myValue);
			} else {
				continue; // continues the loop with the i value  
			}
			for(int x = i+1; x < input.size(); x++) {				
				if (input.get(i).equals(input.get(x))) { // compares the two fractions
					int myInt=((Integer)fraction_count.get(myKey)).intValue();
					fraction_count.put(myKey,new Integer(myInt+1)); // increments the corresponding hashmap value to one
				} //~ if 
			} // ~ for x
		}//~ for i 
		return fraction_count;
	}// ~ method compare
	
}
