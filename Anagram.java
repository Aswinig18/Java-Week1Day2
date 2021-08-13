package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="stops";
		String s2="posts";
		int l1=s1.length();
		int l2=s2.length();
	    	if(l1==l2)
	    	{
	    		char ch1[]=s1.toCharArray();
	    		char ch2[]=s2.toCharArray();
	    		Arrays.sort(ch1);
	    		Arrays.sort(ch2);
	    		for(int i=0;i<ch2.length;i++)
	    		{
	    			if(ch1[i]!=ch2[i])
	    			{
	    				System.out.print(" It Is not an anagram");
	    				break;
	    			}
	    			
	    		}
	    		
    	    	
    	    		System.out.print("It Is  Anagram");
    	    }
	    	else
	    	{
	    		System.out.print("It Is Not An Anagram");
	    	}
	    	
		}
   }
