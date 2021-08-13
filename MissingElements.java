package week1.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,6,0,};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Sorted array:" + arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i)
			{
				System.out.println(i);
					
			}
		}
		

	}

}
