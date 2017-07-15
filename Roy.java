package main.java;

import java.io.*;
public class Roy{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a,b,o2,c1;
        Integer c,d,f,g,h,k=0,f1,o,i,s1,s2;
        char e,e1,e2,e3;
      
        System.out.println("First Name");
        a=br.readLine();
        System.out.println("Last Name");
        b=br.readLine();
        System.out.println("PIN");
        c=Integer.parseInt(br.readLine());
        System.out.println("N");
        d=Integer.parseInt(br.readLine());
        g=a.length();
        h=b.length();
        e=b.charAt(0);
        if(g>h)
        {
            k=1;
        e=a.charAt(0);
        }
        f=Math.abs(e);
        String l=a;
        if(k==1)
        {
           l=b;
        }
        o=l.length();
        char o1[]=new char[o];
        for(i=0;i<l.length();i++)
        {
        e1=l.charAt(i);
        f1=Math.abs(e1);
        o1[i]=e1;
    }
    o2=new String(o1);
    c1=Integer.toString(c);
    s1=d-1;
    s2=(c1.length())-d;
    e2=c1.charAt(s1);
    e3=c1.charAt(s2);
System.out.println("User ID="+e+o2+e2+e3);
         }
    }
