
public class Haskey {
	public static void main(String[] args) {
		String str = "ABDEF";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			int n = (int) ch;
			n = n + 1;
			System.out.print((char) n);
		}
		System.out.println();
	}
}