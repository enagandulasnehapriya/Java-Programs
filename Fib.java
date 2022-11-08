//java program to print first ten numbers in fibonacci series
import java.util.Scanner;
public class Fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int f1=1;
		int f2=2;
		System.out.println(f1+"\t"+f2);
		int f3=f1+f2;
		int i=1;
		while(i<=n)
		{
			System.out.println("\t"+f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
			i++;
		}
	}
}
