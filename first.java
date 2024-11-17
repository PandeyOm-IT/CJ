import java.util.*;
import java.lang.*;
class first 
{
	public static void main (String args[])
	{
		float a,b,c;
		int d;
		System.out.println("ENTER FIRST NUMBER");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		System.out.println("ENTER SECOND NUMBER");
		b=sc.nextFloat();
		System.out.print("1 to add \n ");
		System.out.println("Enter Your Choice from 1 to 4: ");
		d=sc.nextInt();
		switch(d)
		{
			case 1:
			c=a+b;
			System.out.println("Addition of "+ a +" and "+ b +" is "+c);
			break;
			case 2:
			c=a-b;
			System.out.println("Subtraction of "+ a +" and "+ b +" is "+c);
			break;
			case 3:
			c=a*b;
			System.out.println("Multiplication of "+ a +" and "+ b +" is "+c);
			break;
		}
		
	}
}