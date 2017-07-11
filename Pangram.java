import java.io.*;
import java.util.*;
public class Pangram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
System.out.println("Enter the string");
str=sc.nextLine();
char a1[]=str.toLowerCase().toCharArray();
char a2[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
int ch=0;
for(int i=0;i<a2.length;i++)
{
for(int j=0;j<a1.length;j++)
{
if(a2[i]==a1[j])
{
ch++;
break;
}}}
if(ch==26)
{
System.out.println("It is a Pangram");
}
else
{
System.out.println("It is not a Pangram");
}
}
}
