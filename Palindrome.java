package week1.day1;

public class Palindrome {

	
	int output=0;
	public static int reverseNumber(int input)
	{
		int output=0;
		while(input>0)
		{
			output=output*10+ input%10;
			input=input/10;
		}
		return output;
	}
	public static void main(String[] args)
	{
		
		int input=121;
		int n= reverseNumber(input);
		System.out.println("Reverse of number=" + n );
		
		if(n==input)
		{
			System.out.println("It is palindrome");
			}
		else
		{
			System.out.println("It is not palindrome");
		}
		
		
		
	}
	 
}
