package program;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
	System.out.println("display the elements of an Array");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	
		System.out.println("display the elements of an Array in reverse");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
