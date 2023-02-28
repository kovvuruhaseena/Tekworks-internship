import java.util.*;
class PositionSum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter array size: ");
      int n=s.nextInt();
      int array[]=new int[n];
      System.out.println("enter elements:");
      for(int i=0;i<n;i++)
      {
        array[i]=s.nextInt();
      }
    positionSum(array,n);
    }
    public static void positionSum(int arr[],int n)
    {
      int sum=0;
      for(int i=0;i<n;i=i+3)
        {
          sum=sum+a[i];
        }
      System.out.println(sum);
    }
  }