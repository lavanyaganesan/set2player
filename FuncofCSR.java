import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class SRC
{
    void area(double x, double y,double z)
    {
    	double t1 = (x + y + z);
        double s= t1/2;
        double tri = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println( "Area of triangle %1.f "+tri);
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class FuncofCSR
{
     public static void main(String args[]) throws IOException
	{
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 double t1,t2,t3;
    	 float r1,r2;
    	 double c;
	   SRC obj = new SRC();
	   System.out.println("Enter the value of triangle");
	   t1=Double.parseDouble(br.readLine());
	   t2=Double.parseDouble(br.readLine());
	   t3=Double.parseDouble(br.readLine());
	   System.out.println("Enter the value of rectangle");
	   r1=Float.parseFloat(br.readLine());
	   r2=Float.parseFloat(br.readLine());
	   System.out.println("Enter the value of circle");
	   c=Double.parseDouble(br.readLine());
	   
	   obj.area(t1,t2,t3);
	   obj.area(r1,r2);
	   obj.area(c);
        }
}
