package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		arrayListEditing();
		reverseArray(createNewArrayList());
		addToArray();
	}


	private static ArrayList<Integer> createNewArrayList(){
		ArrayList<Integer> AL1 = new ArrayList<>(6);
		for (int i = 0; i < 6; i ++){
			AL1.add(i);
		}
		return AL1;
	}
	private static void addToArray() {
    	ArrayList<Integer> AL1 = new ArrayList<>();
    	ArrayList<Integer> AL2 = new ArrayList<>();
		for (int i = 0; i < 6; i ++){
			AL1.add(i);
		}
		for (int i = 5; i >= 0; i --){
			AL2.add(i);
		}
		AL1.addAll(4,AL2);
		System.out.println(AL1);
	}

	private static void reverseArray(ArrayList<Integer> AL1) {
    	int x = AL1.size();
		int b = AL1.size();
		ArrayList<Integer> AL2 = new ArrayList<>(10);
		for(int i = 0; i <= x-1; i ++){
			int j = AL1.get(b-1);
			AL2.add(j);
			b--;
		}
		System.out.println(AL2);
	}

	private static void arrayListEditing() {
		ArrayList<String> AL1 = new ArrayList<>(10);
		ArrayList<String> AL2 = new ArrayList<>(4);
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
