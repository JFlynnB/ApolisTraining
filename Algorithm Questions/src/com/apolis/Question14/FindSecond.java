package com.apolis.Question14;

/*
 * Question 14: Find second largest number in an array
 */
public class FindSecond {

	public static void main(String[] args) {
		
		int[] array = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5};
		
		int largest = -2147483647;
		int secondLargest = -2147483648;
		
		if(array[0] > largest)
			largest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}
		}
		
		System.out.println("The second largest number is " + secondLargest);
	}

}
