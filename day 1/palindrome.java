import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		int a,b,c,sum=0;
		Scanner o=new Scanner(System.in);
		System.out.println("enter a number");
		a=o.nextInt();
		b=a;
		while(a!=0)
		{
			c=a%10;
			a=a/10;
			sum=(sum*10)+c;
		}
		if(b==sum)
		{
		System.out.println(b+" is a palindrome");	
		}
		else
		System.out.println(b+" is not palindrome");

	}
}