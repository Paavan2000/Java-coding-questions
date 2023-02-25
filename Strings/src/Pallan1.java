
public class Pallan1 {
	public static void generateSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				StringBuffer str=new StringBuffer();
				for (int k = i; k < j; k++) {
					str.append(s.charAt(k));
				}
			}
		}
	}
}
