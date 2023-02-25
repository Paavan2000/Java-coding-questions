package program;

import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("the odd elements present in the even index position of an Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0 && i % 2 == 0 ) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

	}
}
