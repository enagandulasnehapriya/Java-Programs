//java program to search for an element in an array using linear search
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+i+" element");
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int key;
		System.out.println("enter key element to be searched");
		key=sc.nextInt();
		int found=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("element found at position:");
				System.out.println(i+1);
				found=1;
			}
		}
		if(found==0)
		{
			System.out.println("element not found");
		}
	}
}