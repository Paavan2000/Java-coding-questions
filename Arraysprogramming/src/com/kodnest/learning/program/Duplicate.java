package com.kodnest.learning.program;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the element " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Array content");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int arr1[] = new int[n];
		System.out.println("duplicate elements in a array");
		int k = 0;
		for (int i = 0; i <= n-2; i++) {
			for(int j=i+1;j<=n-2-i;j++){
				if (arr[i] != arr[i+1]) {
					arr1[k] = arr[j+1];
					k++;
				}
			}
		}
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.println(arr1[i] + " ");
		}
	}
}
