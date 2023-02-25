package com.kodnest.learning.program;

import java.util.Scanner;

public class Inxdiv3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("the product of all even elements present in the odd index of an Array= ");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0 && i % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
