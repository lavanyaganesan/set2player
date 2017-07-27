
import java.io.*;
import java.util.*;
import java.lang.*;
public class RemoveChar {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int temp=0,i,j;
		System.out.println("Enter the String");
		String str=br.readLine();
		char ch[]=str.toCharArray();
		for(i=0;i<str.length();i++){
			temp=0;
				for(j=0;j<str.length();j++){
					if(ch[i]==ch[j])
						temp++;
				}
				if(temp==1)
					System.out.print(ch[i]);
		}
	}
}
