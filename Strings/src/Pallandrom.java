import java.util.Scanner;

public class Pallandrom {
	public static void main(String[] args) {
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int j = str.length() - 1;
		for (int i = 0; i <= (str.length() - 1) / 2; i++) {
			if (str.charAt(i) == str.charAt(j)) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
			j--;
		}
		if (flag == 1) {
			System.out.println("String is palandrom");
		} else {
			System.out.println("String is not palandrom");
		}
	}
}
