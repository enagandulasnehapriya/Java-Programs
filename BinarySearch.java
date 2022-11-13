import java.util.Scanner;
public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+i+" element:");
				a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int key;
		System.out.println("enter search element:");
		key=sc.nextInt();
		int found=0;
		int mid,low=0,high=n-1;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println("element found at");
				System.out.println(mid+1);
				found=1;
				break;
			}
			else
			{
				if(key<=a[mid])
				{
					high=mid-1;
				}
				else
					low=mid+1;
			}
		}
		if(found==0)
			System.out.println("element not found");
	}
}