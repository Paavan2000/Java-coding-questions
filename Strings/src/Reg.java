import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
	public static void main(String[] args) {
		String reg = "[6-9]{1}+[0-9]{9}";
		String str = "6736145083";
		Pattern pt = Pattern.compile(reg);
		Matcher matcher = pt.matcher(str);
		System.out.println(matcher.matches());

	}
}
