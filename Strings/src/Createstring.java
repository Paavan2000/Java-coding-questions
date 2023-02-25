
public class Createstring {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		char ch[] = { 'H', 'E', 'L', 'L', 'O' };
		String str1 = new String(ch);
		System.out.println(str1);
		StringBuffer st2 = new StringBuffer("HELLO");
		System.out.println(st2);
		StringBuilder st3 = new StringBuilder("HELLO");
		System.out.println(st3);
		String st4 = "";
		System.out.println(st4);
		String str5 = "HELLO";
		System.out.println(str5.length());
		String str6 = "";
		System.out.println(str6.length());
		String str7 = "1";
		System.out.println(str7);
		String str8 = "Hello";
		System.out.println(str8);
		String str9 = "How Are You";
		System.out.println(str9);
		StringBuffer str10 = new StringBuffer(str8+str9);
		System.out.println(str10);
		String str11=str8+str9;
		System.out.println(str11);
		
	}
}
