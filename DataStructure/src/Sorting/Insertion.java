package Sorting;
import java.util.*;
public class Insertion 
{
	public static void insert(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.print("Sorted elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n=sc.nextInt();
		System.out.print("Enter elements:");
		int element[]=new int[n];
		for(int i=0;i<n;i++)
		{
			element[i]=sc.nextInt();
		}
		insert(element,n);
	}
}
