import java.util.Scanner;
public class Isomorphic {
	public static void main(String args[])
	{
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1=sc.nextLine();
		System.out.println("Enter the string 2");
		String s2=sc.nextLine();
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s2.length();j++)
			{
				if(ch[i]==ch[j] && ch1[i]==ch1[j])
				{
					count=1;
				}
			}
		}
		if(count==1)
		{
			System.out.println("ISOMORPHIC STRING");
		}
		else
		{
			System.out.println("NOT ISOMORPHIC STRING");
		}
	}

}
