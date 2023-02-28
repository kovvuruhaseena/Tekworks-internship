import java.util.*;
class Arraysum
  {
    public static void Sum(int array[],int n)
    {
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum=sum+array[i];
        }
      System.out.println("sum is "+sum);
  }
    public static void main(String arg[])
    {
     Scanner s=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=s.nextInt();
      int i=0;
      int array[]=new int[n];
      System.out.println("enter the array elements");
      for(i=0;i<n;i++)
      {
        array[i]=s.nextInt();
      }
      
      Sum(array,n);
    }
  }
    