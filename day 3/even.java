import java.util.Scanner;
class even
{
public static void main(String args[])
{int i,j,n;
Scanner o=new Scanner(System.in);
System.out.println("enter a number");
n=o.nextInt();
System.out.println("even numbers are:");
for(i=1;i<=n;i++){
if(i%2==0)
System.out.println(i);
}
}
}