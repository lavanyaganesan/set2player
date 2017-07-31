
import java.util.*;
import java.io.*;
public class Romannum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String rom_num;
int dec_num=0;
System.out.println("Enter a Roman number:");
rom_num=sc.nextLine();
rom_num=rom_num.toUpperCase(); 
int len=rom_num.length();
int num=0;
int pre_num=0;
for(int i=len-1;i>=0;i--)
{
char x=rom_num.charAt(i);
x=Character.toUpperCase(x);
switch(x)
{
case 'I':
pre_num=num;
num=1;
break;
case 'V':
pre_num=num;
num=5;
break;
case 'X':
pre_num=num;
num=10;
break;
case 'L':
pre_num=num;
num=50;
break;
case 'C':
pre_num=num;
num=100;
break;
case 'D':
pre_num=num;
num=500;
break;
case 'M':
pre_num=num;
num=1000;
break;
}
if(num<pre_num)
{
dec_num=dec_num-num;
}
else
{
dec_num=dec_num+num;
}
}
System.out.println("Roman Numeral of " + rom_num+" is "+dec_num);
}
}
