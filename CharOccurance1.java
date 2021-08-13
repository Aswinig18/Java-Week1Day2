package week1.day2;

public class CharOccurance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Chennai";
		int orgLen=str.length();
		String strnew=str.replace("e", "");
		int newLen=strnew.length();
		System.out.println(orgLen-newLen);

	}

}
