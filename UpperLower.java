import java.util.Scanner;
public class UpperLower {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
		    char c = sb.charAt(i);
		    if (Character.isLowerCase(c)) {
		        sb.setCharAt(i, Character.toUpperCase(c));
		    } else {
		        sb.setCharAt(i, Character.toLowerCase(c));
		    }
		}
		System.out.println(sb.toString());
	}

}
