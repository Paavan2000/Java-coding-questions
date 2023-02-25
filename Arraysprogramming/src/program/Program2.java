package program;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(" elements present in the even index of an Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i% 2 == 0) {
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
	}
}
