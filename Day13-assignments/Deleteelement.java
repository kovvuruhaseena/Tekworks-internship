import java.util.*;
class Deleteelement
  {
    public static void main(String arg[])
   {
    Scanner s=new Scanner(System.in);
     System.out.println("enter array size");
     int n=s.nextInt();
     int array[]=new int[n];
     for(int i=0;i<n;i++)
       {
         array[i]=s.nextInt();
       }
     deleteElement(array,temp,n);
  }
    public static void deleteElement(int array[],int n)
    {
      int temp[]=new int[n-1];
      for(int i=0;i<n-1;i++)
        {
          if(i<n-1)
          {
            temp[i]=array[i];
          }
          else if(temp[i]<array[i+1])
          {
            temp[i]=array[i+1];
          }
        }
      System.out.println(temp[i]);
    }
  }