import java.util.*;
import java.lang.*;
class P1
{
	public static void main (String args[])
	{
		int a,b,c;
		int d;
		System.out.println("ENTER FIRST NUMBER");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		b=sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			for(int j=1;j<11;j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
				System.out.println("\n");
		}
		
	}
}