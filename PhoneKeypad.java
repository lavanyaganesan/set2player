import java.util.Scanner;
import java.io.*;
public class PhoneKeypad {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the button number:");
	String a=sc.nextLine();
	int n=a.length();
	for(int i=0;i<n;i++)
	{
		char c=a.charAt(i);
	switch(c)
	{
	case '2':
		System.out.println("ABC");
		break;
	case '3':
		System.out.println("DEF");
		break;
	case '4':
		System.out.println("GHI");
		break;
	case '5':
		System.out.println("JKL");
		break;
	case '6':
		System.out.println("MNO");
		break;
	case '7':
		System.out.println("PQRS");
		break;
	case '8':
		System.out.println("TUV");
		break;
	case '9':
		System.out.println("WXYZ");
		break;
	default:
		System.out.println("INVALID");
		break;
	}
}
}
}
