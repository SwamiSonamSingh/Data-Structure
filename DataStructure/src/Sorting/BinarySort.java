package Sorting;
import java.util.*;
public class BinarySort 
{
	public static void swapper(int element[],int start,int end)
	{
		int temp=element[start];
		element[start]=element[end];
		element[end]=temp;
	}
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element:");
		int n=sc.nextInt();
		int element[]=new int[n];
		System.out.print("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			element[i]=sc.nextInt();
		}
		int start=0,end=n-1;
		while(start<end)
		{
			if(element[start]==0)
			{
				swapper(element,start,end);
				if(element[start]==1)
				{
					start++;
				}
				end--;
			}
			else
			{
				start++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(element[i]+" ");
		}
	}
}
