import java.util.*;
class Alternate
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();
      int array[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      alternate(array,n);
    }
    public static void alternate(int array[],int n)
    {
     for(int i=1;i<n;i++)
       {
         if(i%2==0)
         {
           System.out.print(array[i]+" ");
         }
       }
    }
  }