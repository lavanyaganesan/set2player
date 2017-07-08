import java.io.*;
import java.util.*;
public class Reversenum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,temp,rem;
System.out.println("Enter the number");
n=sc.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(temp==sum)
System.out.println("It is a palindrome number");
else
System.out.println("It is not a palindrome number");
}
}
