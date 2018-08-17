import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int a,b,c=0,sum=0;
		
		System.out.println("enter a number");
    		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			c++;
			
		}
		if(c==2)
		System.out.println(a+" is a prime number");
		else
		System.out.println(a+" is not a prime number");
	}

}
