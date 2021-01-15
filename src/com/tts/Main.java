package com.tts;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numberArray = new ArrayList<>(5);
		System.out.println("Enter 5 numbers with a space between and then press enter.");
		while (input.hasNextInt()) {
			numberArray.add(input.nextInt());
			if (numberArray.size()== 5)break;
		}
		System.out.println("Let's get the sum, product and the smallest and largest number" + numberArray);
		int sum = 0;
		for (Integer integer : numberArray) {
			sum += integer;
		}
		int prod = 1;
		for (Integer integer : numberArray) {prod *= integer;}
		System.out.println("Your sum is = " + sum);
		System.out.println("Your product is = " + prod);
		Collections.sort(numberArray);
		System.out.println("The smallest number is: " + numberArray.get(0));
		System.out.println("The largest number is: " + numberArray.get(4));

    }
}
