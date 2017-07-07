import java.io.*;
import java.util.Scanner;
public class Encoder {
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a,b;
		System.out.println("Enter the String 1 and 2");
		a=sc.nextLine();
		b=sc.nextLine();
		char ch,ch1;
		String input1="";
		String input2="";
		int i,j,a1;
		for(i=0;i<a.length();i++)
		{
			
			ch=a.charAt(i);
			if(ch>='a' && ch<='p')
			{
				input1=input1+(char) (ch+10);
			}
			else
			{
				if(ch>='q' && ch<='z')
				{
				a1=0;
				while((122-ch+a1)!=10)
				{
					a1++;
				}
				input1=input1+(char)(a1+97);
				}
		}
		}
		for(j=1;j<b.length()-1;j++)
		{
			ch1=b.charAt(j);
			if(ch1>='a' && ch1<='p')
			{
				input2=input2+(char) (ch1+10);
			}
			else
			{
				if(ch1>='q' && ch1<='z')
				{
				a1=0;
				while((122-ch1+a1)!=9)
				{
					a1++;
				}
				input2=input2+(char)(a1+97);
		}
	}
		}
    System.out.println("Encode : "+input1+" "+b.charAt(0)+input2+b.charAt(b.length()-1));
	}
}

