import java.io.*;
import java.util.*;
public class Pyramid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
for(int i=num;i>0;i++)
{
for (int j = (i * 2); j > 0; j--)
	      {
					if (j != i) 
	        {
						System.out.print("*");
					}
	        else 
	        {
						System.out.print(" *");
					}
				}
				System.out.println();
        }
		}
	}
