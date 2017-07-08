import java.io.*;
import java.util.*;
public class Reverseorder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
int i;
System.out.println("Enter the string");
s=sc.nextLine();
System.out.println("If i enter "+s);
String s1[]=s.split(" ");
String output=" ";
for(i=s1.length-1;i>=0;i--)
{
output =output+(s1[i]+" ");
}
System.out.println("I should get "+output.trim());
}
}
