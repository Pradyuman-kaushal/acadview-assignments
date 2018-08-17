import java.util.Scanner;
class large
{
	public static void main(String args[])
	{
		int a,b,c,max=0;
		Scanner o=new Scanner(System.in);
		System.out.println("enter three numbers");
		a=o.nextInt();b=o.nextInt();c=o.nextInt();
		if(a>=b&&a>=c)
		{
			System.out.println(a+" is the greatest number");
		}
		else if(b>=a&&b>=c)
		{
			System.out.println(b+" is the greatest number");
		}
		else if(c>=b&&c>=a)
		{
			System.out.println(c+" is the greatest number");
		}

	}
}