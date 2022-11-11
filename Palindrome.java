//java program to check whether a given number is palindrome or not
import java.util.Scanner;
public class Palindrome
{
	public static void main(String  args[])
	{
		int r,rev=0,n,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println(t+ "is a palindrome");
		}
		else
		{
			System.out.println(t+ "is not a palindrome number");
		}
	}
}