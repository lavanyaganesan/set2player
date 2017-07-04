import java.io.*;
import java.util.*;
public class DiffTimes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int h1,m1,h2,m2,tmin,tmin2,min;
System.out.println("Enter the first time (hours and seconds));
h1=sc.nextInt();
m1=sc.nextInt();
tmin=h1*60;
tmin=tmin+tmin;
System.out.println("Enter the second time (hours and seconds));
h2=sc.nextInt();
m2=sc.nextInt();
tmin1=h2*60;
tmin1=tmin1+tmin1;
min=tmin1-tmin;
System.out.println("The minute difference between 2 time is : "+min);
}
}

