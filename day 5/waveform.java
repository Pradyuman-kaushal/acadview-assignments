import java.util.Scanner;
class waveform {
public static void main(String[] args) {
int i,j,n=10,t;
int arr[]=new int[10];
System.out.println("enter 10 elements in array:");
Scanner o=new Scanner(System.in);
for(i=0;i<n;i++)
{
arr[i]=o.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}

i=0;
while(i<n)
{
t=arr[i];
arr[i]=arr[i+1];
arr[i+1]=t;
i=i+2;
}
System.out.println("waveform :");
for(i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}



