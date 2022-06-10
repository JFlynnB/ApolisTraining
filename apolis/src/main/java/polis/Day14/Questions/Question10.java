package polis.Day14.Questions;

/*
 * Question 10 : Write java Program to Find Smallest and Largest Element in an Array.
 */
public class Question10 {

	public static void main(String[] args) {
		
		int[] array = {22, 31, 4, 8, 15, 55, 16, 23, 42};
		
		int largest = -2147483648;
		int smallest = 2147483647;
		
		for(int i = 0; i < array.length; i++) {
			if(smallest > array[i])
				smallest = array[i];
			if(largest < array[i])
				largest = array[i];
		}
		System.out.println("The smallest element in the array is " + smallest);
		System.out.println("The largest element in the array is " + largest);
	}

}
