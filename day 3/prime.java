import java.util.Scanner;
class prime {
  public static void main(String[] args) {
    int i,j,a,b,c=0,n;
    Scanner o=new Scanner(System.in);
    System.out.println("enter the number to find prime no");
    n=o.nextInt();
    System.out.println("Prime no upto "+n);
    for(i=1;i<=n;i++)
    {c=0;
      for(j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          c++;
        }
      }
      if(c==2)
      {
        System.out.println(i);
      }

    }


  }
}