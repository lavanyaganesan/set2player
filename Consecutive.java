import java.io.*;
import java.util.*;
public class Consecutive
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string 1");
String s1=sc.nextLine();
System.out.println("Enter the string 2");
String s2=sc.nextLine();
int len=s1.length();
for(int i=0;i<len-2;i++)
{
if(s2.contains(s1.substring(i,i+2)))
{
count=1;
}
}
if(count==1)
{
System.out.println("Substring is present");
}
else
{
System.out.println("Substring is not present");
}
}
}
