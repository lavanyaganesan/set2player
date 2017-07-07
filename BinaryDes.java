import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryDes {
  public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Integer n,i;
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the number of array");
		n=sc.nextInt();
		System.out.println("Enter the array of elements");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			list.add(a[i]);
		}
		Collections.sort(list);
        Collections.reverse(list);
		System.out.println("Desending order number is");
		list.toString();
		for(Integer x:list)
		{
			System.out.println(x);
		}
		
	}

}
