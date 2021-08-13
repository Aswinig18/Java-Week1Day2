package week1.day2;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,6,4,5,3,9,2,4,2};
		Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Sorted Array:"+arr[i]);
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==arr[i+1])
				{
					System.out.println("Duplicate Array is:"+arr[i+1]);
				}
			}

	}

}
