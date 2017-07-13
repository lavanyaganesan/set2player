import java.io.*;
import java.util.*;
public class Addsum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> list=new ArrayList<Integer>();
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
if(n<=9)
{
System.out.println("Enter a value greater than 9");
}
else
{
while(n>0)
{
int rem=n%10;
list.add(rem);
n=n/10;
}
Collections.reverse(list);
for(int i=0;i<list.size();i++)
{
for(int j=0;j<=i;j++)
{
sum = sum+list.get(j);
}
}
System.out.println("Sum of the digits: "+sum);
}
}
}
