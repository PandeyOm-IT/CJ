import java.util.*;
import java.lang.*;
class Primes
{
	public static void main(String agrs[])
	{
		int a,flag=0;
		System.out.print("Enter First Number: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a==1)
		{
				System.out.println(a+" is neither Prime nor Composite.");
		}
		else
		{	
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=flag+1;
				break;
			}
			
		}
		if(flag!=1)
		{
			System.out.println("the Entered Number is a Prime Number");
		}
		else
		{
			System.out.println("the Entered Number is not a Prime Number");	
		}
}
	}
}