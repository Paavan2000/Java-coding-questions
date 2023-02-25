package program;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the inder element " + i);
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		int product = 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("sum of array elements = " + sum);
		System.out.println("Average of array = " + sum / n);
	}
}
