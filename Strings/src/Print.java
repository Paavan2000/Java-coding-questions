
public class Print {
	public static void main(String[] args) {
		//System.out.println("Hello today is \"wednesday\"");
		//char ch[]={'H','"','L'};
		//String s=new String(ch);
		//System.out.println(ch);
		//String str="Hello";
		//String str1="Hello"+str;
		//System.out.println(str1);
		//System.out.println(str.concat(str1));
		//StringBuffer str2=new StringBuffer("Hello");
		//StringBuffer str3=new StringBuffer("Hello");
		//StringBuffer str4=str2.append(str3);
		//System.out.println(str4);
		StringBuffer s=new StringBuffer("REPUBLICDAY");
		//char []ch=s.toCharArray();
		//System.out.println(ch.length);
		//System.out.println(s.reverse());
		for(int i=(s.length())/2+1;i<=s.length()-1;i++){
			System.out.println(s.charAt(i));
		}
		}
	}