package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I Am A Software Tester";
		String[] str1=str.split(str);
		String []s1=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{
				StringBuilder sb=new StringBuilder(s1[i]);
				s1[i]=sb.reverse().toString();
				System.out.println(s1[i]);
			}
			else
			{
				System.out.println(s1[i]);
			}
			
		}
		

	}

}
