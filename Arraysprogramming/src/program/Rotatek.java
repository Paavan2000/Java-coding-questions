package program;

import java.util.Scanner;

public class Rotatek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int k=2;
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before rotation of array");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("after rotation of array");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[((i+k)%n)]+" ");
		}
		System.out.println();
	}
}
