package com.company;

import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
		arrayListEditing();
	}

	private static void arrayListEditing() {
		ArrayList<String> AL1 = new ArrayList();
		ArrayList<String> AL2 = new ArrayList();
		AL1.add("George");
		AL1.add("Fred");
		AL1.add("Ron");
		AL1.add("Bill");
		AL1.add("Charlie");
		AL1.add("Ginny");
		System.out.println(AL1);
		AL2.add("Hermione");
		AL2.add("Harry");
		AL2.add("Neville");
		AL2.add("Draco");
		AL1.addAll(1, AL2);
		System.out.println(AL1);
		AL1.remove(1);
		System.out.println(AL1);
		System.out.println(AL1.get(3));
		AL1.set(0, "Molly");
		System.out.println(AL1);
	}
}
/*Task-1: Write a java program to do the following:
Create 2 arraylists AL1 and AL2
Add data into AL1 and print them out
Add data into AL2
Add the content of collection list AL2 into AL1 starting from index 1
Print out the new AL1
Delete the data item at index 1 in AL1 and print out
Print out the data at index 3 in AL1
Replace the data at index 0 in AL1 with another data and print out
Submit your tested code

Task-2: Write a program to add index of numbers into an arraylist and print them out.
Submit your tested code

Task-3: Write a program to reverse an ArrayList by passing into a method.
This method takes an arraylist as a parameter,
traverses in reverse order and
adds all the elements to the newly created arraylist.
Finally the reversed arraylist is returned for printing.
Submit your tested code in GitHub*/