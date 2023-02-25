package com.kodnest.learning.program;

import java.util.Scanner;

public class Delectele {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the element " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Array content before delecting the element");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the element to delect");
		int element = scan.nextInt();
		int arr1[] = new int[n];
		int j = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != element) {
				arr1[j] = arr[i];
				j++;
			} else {
				System.out.println("element not found");
			}
		}
		System.out.println("Array content after delecting the element");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
}
