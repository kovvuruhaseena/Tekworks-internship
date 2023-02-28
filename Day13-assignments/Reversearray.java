import java.util.*;
class Reversearray
  {
    public static void reverseArray(int array[],int n)
    {
      int temp;
      int i;
      for(i=0;i<n/2;i++)
        {
          temp=array[i];
          array[i]=array[n-1-i];
          array[n-1-i]=temp;
        }
      System.out.println("reverse array is:");
    for(i=0;i<n;i++)
      {
        System.out.println(array[i]);
      }
  }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=s.nextInt();
      int i;
      int array[]=new int[n];
      for(i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      reverseArray(array,n);
    }
  }