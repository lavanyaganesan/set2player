import java.util.Scanner;

public class Xmark {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	int len=s.length();
	for(int i=0;i<len;i++)
			{
		for(int j=0;j<len;j++)
		{
			if((j==i) || j==(len-1-i))
			{
				System.out.print(ch[j]);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
			}
}
}
