
public class Reverseword {
	public static void main(String[] args) {
		String str = "I am a technie";
		String ch[] = str.split("\\s+");
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < ch.length - 1; i++) {
			str1 = str1 + ch[i] + " ";
		}
		String word = "technie";
		boolean result = str.contains(word);
		int j = word.length() - 1;
		if (result == true) {
			for (int i = 0; i <= word.length() - 1; i++) {
				str2 = str2 + word.charAt(j);
				j--;
			}
		}
		System.out.println(str1 + str2);
	}
}
