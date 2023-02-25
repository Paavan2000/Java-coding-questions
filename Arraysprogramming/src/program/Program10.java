package program;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the inder element " + i);
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 != 0) {
				sum = sum + arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("sum of array elements:" + sum);
	}
}
