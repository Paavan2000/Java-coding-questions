package com.kodnest.learning.program;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("the average of all elements in an Array= ");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum / n);
	}
}
