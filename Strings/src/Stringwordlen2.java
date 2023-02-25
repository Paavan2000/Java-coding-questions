
public class Stringwordlen2 {
	public static void main(String[] args) {
		String str = "I am a technie";
		String ch[] = str.split("\\s+");
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i].length() == 2) {
				count++;
				System.out.println(ch[i]);
			}
		}
		System.out.println(count);
	}
}
