package com.vikku;

public class StringFunction {
	//public static void main(String[] args) {
	//	String magic = "Vikku";
	//	System.out.println(magic.length());
	//	System.out.println(magic.charAt(2));
	//}
	String name = "Vikku";
	String sentence = "Hello how are you?";
	public void print() {
		System.out.println(name.toUpperCase());
		System.out.println(sentence);
		System.out.println(sentence.length());
	}
	public static void main(String[] args) {
		StringFunction obj = new StringFunction ();
		obj.print();
		
	String sentence = "I love learning java programming";
	        
	        if (sentence.toLowerCase().contains("java")) {
	            System.out.println("The word 'java' is present in the sentence.");
	        } else {
	            System.out.println("The word 'java' is not present in the sentence.");
	        }

	}
}
