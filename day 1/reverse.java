import java.util.Scanner;
class reverse
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
		
		System.out.println("reverse is:"+sum);	
		
	}
}