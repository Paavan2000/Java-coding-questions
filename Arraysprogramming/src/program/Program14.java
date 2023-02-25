package program;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("enter the inder element " + i);
			arr[i] = scan.nextInt();
		}
		int lar=arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
				if(arr[i]>lar){
					lar=arr[i];
			}
		}
		System.out.println("largest element in a array"+lar);
	}
}
