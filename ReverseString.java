import java.io.*;
import java.util.*;
public class ReverseString
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String firstString,secondString="";
System.out.println("Enter the String");
firstString=br.readLine();
int len=firstString.length();
for(int i=len-1;i>=0;i--)
{
secondString=secondString+firstString.charAt(i);
}
System.out.println(secondString);
}
}
}
