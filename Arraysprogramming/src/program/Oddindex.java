package program;

import java.util.Scanner;

public class Oddindex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print(" Product of event elements present in the odd index of an Array = ");
		int product=1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i]%2==0 && i% 2 != 0) {
				product=product*arr[i];
			}
		}
		System.out.println(product);
	}
}
