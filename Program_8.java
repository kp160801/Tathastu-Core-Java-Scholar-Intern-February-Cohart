package core_java;

// Program 8.Write a Java Program to check whether the given array is Mirror Inverse or not.
 
import java.util.*;
public class Program_8
{

	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[arr[i]] != i)
				return false;
		}

	
		return true;
	}

	
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter number of elements of array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter integers of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}	
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
