package program;

import java.util.Arrays;
import java.util.Scanner;

public class Seclargele {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Second smallest number in array " + arr[1]);
	}
}
