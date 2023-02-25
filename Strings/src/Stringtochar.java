
public class Stringtochar {
	public static void main(String[] args) {
		String str = "HELLO";
		//char ch[] = str.toCharArray();
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		int i = 0;
		while (i <= str.length() - 1) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
