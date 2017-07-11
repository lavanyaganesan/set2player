import java.io.*;
import java.util.*;
public class Square
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b[]=new int[10];
System.out.println("Enter the square number");
for(int i=0;i<4;i++)
{
a[i]=sc.nextInt();
b[i]=sc.nextInt();
}
if(a[0]==b[3] && b[0]==a[1] && b[1]==a[2] && b[2]==a[3])
{
System.out.println("It is square");
}
else
{
System.out.println("It is not a square");
}
}
}
