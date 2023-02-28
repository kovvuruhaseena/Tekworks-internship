import java.util.*;
class Negativenumbers
  {
    public static void negativeNumbers(int array[],int n)
    {
      int negative_count=0;
      int positive_count=0;
      for(int i=0;i<n;i++)
        {
          if(array[i]>0)
          {
            positive_count++;
          }
          else
          {
            negative_count++;
          }
        }
      System.out.println("negative number of elements = "+negative_count);
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
      negativeNumbers(array,n);
    }
  }