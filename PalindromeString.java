package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		String rev="";
		int lenstr=str.length();
		for(int i=lenstr-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed word is:"+rev);
		if(str.equals(rev))
		{
			System.out.println(str +" It Is Palindrome");
		}
		else
		{
			System.out.println("It Is Not a Palindrome");
		}
		

	}

}
