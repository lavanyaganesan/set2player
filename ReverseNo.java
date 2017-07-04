import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,res,rev=0;
System.out.println("Enter the number");
num=sc.nextInt();
while(num>0)
{
res=num%10;
rev=rev*10+res;
num=num/10;
}
System.out.println("Reverse number is: "+rev);
}
}
