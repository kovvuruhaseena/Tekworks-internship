import java.util.*;
class Arraymax
  {
    public static void Maximumnumber(int array[],int n)
    {
      int maxnumber=array[0];
      int minnumber=array[0];
     for(int i=1;i<n;i++)
        {
          if(maxnumber<array[i])
          {
          maxnumber=array[i];
          }
         if(minnumber>array[i])
        {
        minnumber=array[i];
        }
   }
     System.out.println("maximum number "+maxnumber+"minimum number is "+minnumber); 
  }
    public static void main(String arg[])
    {
     Scanner s=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=s.nextInt();
      int i;
      int array[]=new int[n];
      for(i=0;i<n;i++)
      {
        array[i]=s.nextInt();
      }
      Maximumnumber(array,n);
    }
  }