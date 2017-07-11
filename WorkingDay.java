import java.io.*;
import java.util.*;
public class WorkingDay
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Day");
String s=sc.nextLine();
if((s.equalsIgnoreCase("sunday"))||(s.equalsIgnoreCase("sunday")))
{
System.out.println("False");
}
else if((s.equalsIgnoreCase("monday"))||(s.equalsIgnoreCase("tuesday"))||(s.equalsIgnoreCase("wednesday"))||
(s.equalsIgnoreCase("thursday"))||(s.equalsIgnoreCase("friday")))
{
System.out.println("True");
}
else
{
System.out.println("Invalid Day");
}
}
}
