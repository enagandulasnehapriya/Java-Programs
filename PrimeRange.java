//java program to display prime numbers within the given range of numbers.
import java.util.Scanner;
public class PrimeRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,j,count;
		System.out.println("the prime numbers between "+m+" and "+n+" are :");
		for(i=m;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(" "+i);
			}
		}
	}
}
		
