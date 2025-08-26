package array;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {

		System.out.println("Enter the size of array elements");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Size of an array is: "+size);
	
		System.out.println("Enter the array elements ");
		int[] arr= new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int ref:arr) {
			System.out.print("The array elements are:" +ref+ " ");
		}
		sc.close();
	}

}
