import java.io.*;
import java.util.*;
public class SnakeGame
{
public static void main(String args[])
{
int i,j,row,col;
	sc = new Scanner(System.in);
	System.out.println("Enter the rows");
	row=sc.nextInt();
	System.out.println("Enter the column");
	col=sc.nextInt();
	for(i=1;i<=row;i++)
	{
		for(j=1;j<=col;j++)
		{
			if(i==1||i==row||j==1||j==col)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}
