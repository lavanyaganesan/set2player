import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ThreeFour {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n numbers");
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		list.add("3");
		list.add("4");
		int cn=0;
		while(list.size()<n)
		{
			ArrayList<String> three=new ArrayList<String>();
			ArrayList<String> four=new ArrayList<String>();
			for(int i=cn;i<list.size();i++)
			{
				three.add("3" +list.get(i));
				four.add("4" +list.get(i));
				cn++;
			}
			for(String s:three)
			{
				list.add(s);
			}
			for(String s:four)
			{
				list.add(s);
			}
			
		}
		System.out.println("Result");
		for(String s:list)
		{
		System.out.println(" "+s);
	}
	}
}
