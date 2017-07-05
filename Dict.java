import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dict
{
public static void main(String args[]) throws NumberFormatException, IOException
{
ArrayList<String> list=new ArrayList<String>();
int flag=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of words");
Integer n=Integer.parseInt(br.readLine());
String str[]=new String[n];
System.out.println("Enter the words for dictionary");
for(int i=0;i<n;i++)
{
str[i]=br.readLine();
}
Arrays.sort(str);
System.out.println("Enter a sentence: ");
String sentence=br.readLine();
for(String s1:sentence.split(" "))
{
for(String s2:str)
{
if(s1.equalsIgnoreCase(s2))
{
flag=1;
}
}
if(flag==0)
list.add(s1);
}
for(String dictionary:str)
{
for(String ans:list)
{
int len=0;
char ch[]=ans.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(dictionary.contains(String.valueOf(ch[i])))
{
len++;
}
if(len==ch.length)
{
System.out.println("Suggested word for \""+ans+"\" is \""+dictionary+"\"");
}
}
}
}
}
}

