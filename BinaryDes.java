import java.util.*;
import java.io.*;
public class BinaryDes
{
public static void main(String args[]) throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements u want?");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int i+1;j<n;j++)
{
if(a[i]<a[j])
{
count=a[i];
a[i]=a[j];
a[j]=count;
}
}
}
System.out.println("Descending order:");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.println(a[n-1]);
}
}
