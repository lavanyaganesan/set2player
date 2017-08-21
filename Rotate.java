import java.util.Scanner;

public class Rotate {
	private static Scanner sc;

	public static void main(String args[])
	{
		String s="";
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s=s+Integer.toString(a[i]);
			
		}
		//int len=s.length();
		String s1=s.substring(0,k+1);
		String s2=s.substring(k+1,n);
		System.out.println(s2+s1);
		}
		
	}


