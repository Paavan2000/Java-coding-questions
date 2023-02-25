package com.kodnest.learning.program;

import java.util.Scanner;

public class Avddiv32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("the average of all elements in an Array which are multiples of 3 and divisible by 2= ");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum / n);
	}
}
