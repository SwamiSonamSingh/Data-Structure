package Sorting;
import java.util.*;
public class Bubble 
{
	public static void sort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<(n-1-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
	}
}
