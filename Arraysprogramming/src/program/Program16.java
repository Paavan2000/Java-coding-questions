package program;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the elemnt");
		int n=scan.nextInt();
		int count=0;
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
			if(arr[i]==n){
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
