package program;

import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("the even elements present in the even index position of an Array which are multiples of 2 and 3.");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0 && i % 2 == 0 && i%2==0 && i%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

	}

}
