import java.util.*;
import java.io.*;
public class SubsetString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a;
		int n,len,i,j,index=0,start=0;
		System.out.println("Enter the string");
		a=sc.nextLine();
		char ch[]=a.toCharArray();
		n=a.length();
		System.out.println("Enter the number");
		len=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(index-start+1==i)
			{
				if(i==len)
				{
					for(j=index;j<n;j++)
					{
						for(i=start;i<index;i++)
							System.out.print(ch[i]);
						System.out.println(ch[j]);
					}
					
					if(start!=i)
					{
						start++;
						index=start;
						
					}
				}
				else
				{
					index++;
				}
			}
		}
		
	}

}
