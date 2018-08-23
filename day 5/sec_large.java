import java.util.Scanner;
class sec_large {
  public static void main(String[] args) {
    int n,i,j,max,pos=0;
    Scanner o=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.println("Enter 10 elements in array");
    for(i=0;i<10;i++)
    {
      arr[i]=o.nextInt();
    }
    max=arr[0];
    for(j=0;j<2;j++)
    {
    for(i=0;i<10;i++)
    {
      if(max<=arr[i])
      {
        max=arr[i];
        pos=i;
      }
    }
    if(j==0){
      int t=arr[pos];
      for(int k=0;k<10;k++)
      {
        if(t==arr[k])
        {
          arr[k]=-32768;
        }
      }
    
    max=arr[0];}
    }
    
    System.out.println("Second largest element in array is: "+max);
    
  }
}

