import java.io.*;
import java.util.*;
public class PrimeRange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,flag=0,i,j;
System.out.println("Enter the upper limit");
n1=sc.nextInt();
System.out.println("Enter the lower limit");
n2=sc.nextInt();
System.out.println("Prime numbers are: ");
for(i=n1;i<n2;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
if(flag==1)
{
System.out.print(i+" ");
}
}
}
}
