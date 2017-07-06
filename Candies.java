import java.io.*;
import java.util.*;
public class Candies
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number of childrens:"):
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the rating for each children:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Minimum candies are:");
int temp=n;
int s=0;
Arrays.sort(a);
for(int j=0;j<n-1;j++)
{
if(a[j]<a[j+1])
{
s++;
temp=temp+s;
}
}
System.out.println(temp);
}
}
