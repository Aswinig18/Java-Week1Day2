package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,67,37,89,100,20,9};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("sorted array:" + arr[i]);
		}
		
		System.out.println("second Largest:" + arr[arr.length-2]);

	}

	

}
