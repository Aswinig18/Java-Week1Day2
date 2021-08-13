package week1.day2;

public class Calculator
{
	
	public int add(int num1,int num2,int num3)
	{
		int A= num1+num2+num3;
		return A;
	}
	public int sub(int num1,int num2)
	{
		int S=num1-num2;
		return S;
	}
	public double mult(double num1, double num2)
	{
	    double M=num1*num2;
	    return M;
	}
	public float divide(float num1, float num2)
	{
		float F=num1/num2;
		return F;
	}
public static class MyCalculator
{
	
	public static void main(String[] args)
	{
		int num1=50;
		int num2=20;
		int num3=10;
		Calculator CalObj=new Calculator();
		int result=CalObj.add( num1,  num2, num3);
		int result1=CalObj.sub(num1, num2);
		int result2=(int) CalObj.mult(num1, num2);
		int result3=(int) CalObj.divide(num1, num2);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
}
	

}
