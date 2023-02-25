package program;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(" elements present in the index position which is a multiple of 3.");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
