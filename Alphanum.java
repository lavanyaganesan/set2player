package milelcm;

import java.util.Scanner;

public class Alphanum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a;
		char t;
		int i,j,x,f;
		System.out.println("Enter the string:");
		a=sc.nextLine();
		for(i=0;i<a.length();i=i+2)
		{
char ch[] = a.toCharArray();
		{
		t=ch[i];
		if((ch[i+2]-48)>=0 && (ch[i+2]-48)<=9)
		{
		x=((ch[i+1]-48)*10)+(ch[i+2]-48);
		for(f=0;f<x;f++)
{
		System.out.print(t);
		}
		i++;
		}
		else
		{
for(j=0;j<ch[i+1]-48;j++)
{
System.out.print(t);
    }}}}}}
