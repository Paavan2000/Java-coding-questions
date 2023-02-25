package com.kodnest.learning.program;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the element " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element");
		int element = scan.nextInt();
		System.out.println("Before rotation of array");
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (element == arr[i]) {
				count++;
			}
		}
		System.out.println("Frequency of " + element + " in an array " + count);
	}
}
