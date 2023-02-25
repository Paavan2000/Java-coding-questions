package program;

import java.util.Scanner;

public class Program255 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("odd elements present in the even index position of an Array which are multiples of 5");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0 && i % 2 == 0 && i%5==0 ) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

	}
}
