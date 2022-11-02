import java.util.Scanner;
public class MinMax
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");

		int x=sc.nextInt();
		int max=x;
		int min=x;
		for(int i=0;i<2;i++)
		{
			x=sc.nextInt();
			if(x>max)
				max=x;
			else
				min=x;
		}
		System.out.println("Max_Value="+max+"\nMin_Value="+min);
	}
}