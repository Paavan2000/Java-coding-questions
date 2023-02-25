package program;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the inder element " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Elements Contents");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse Array");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
