import java.util.*;
import java.util.*;
public class StringCamel
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
String input=br.readLine();
String output=" ";
char camel=input.charAt(0);
output=output+Character.toUpperCase(camel);
for(int i=1;i<input.length();i++)
{
char c1=input.charAt(i);
char c2=input.charAt(i-1);
if(c2==' ')
{
output=output+Character.toUpperCase(c1);
}
else
{
output=output+Character.toLowerCase(c1);
}
}
System.out.println("Before string conversion: "+input);
System.out.println("After string to camelcase conversion: "+output);
}
}
