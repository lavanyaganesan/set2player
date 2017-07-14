import java.util.*;
import java.io.*;
public class SeedNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the seed number");
int x=sc.nextInt();
System.out.println("Enter the number");
int y=sc.nextInt();
int count;
count=x;
int a=count%10;
if(a==count)
{
count=count*count;
}
else
while(x>0)
{
count=(x%10)*count;
x=x/10;
}
if(count==y)
{
System.out.println("Yes it is seed of x "+count);
}
else
{
System.out.println("No it is not a seed of x "+count);
}
}
}
