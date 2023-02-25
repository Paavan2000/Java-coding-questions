package com.kodnest.learning.program;

import java.util.Scanner;

public class Sumelediv4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array content");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("the sum of all elements present in the indexes which are divisible by 4 in an Array= ");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 4 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
