import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class LeastNumberdel {
public static void main(String args[]) throws NumberFormatException, IOException
{
	ArrayList<Integer> list=new ArrayList<Integer>();
	Integer n,i,rem;
	String x="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number(positive or negative)");
		n=Integer.parseInt(br.readLine());
		n=Math.abs(n);
		for(i=0;n>9;i++)
		{
			rem=n%10;
			n=n/10;
			list.add(rem);
		}
		if(n>=0)
			list.add(n);
		Collections.sort(list);
		for(Integer s:list)
			x=x+s.toString();
			System.out.println("Sorting number are: "+x);
		
		System.out.println("Enter the Integer you want to delete?");
		Integer c=Integer.parseInt(br.readLine());
		System.out.println(x.substring(0,x.length()-c));
    }
}
