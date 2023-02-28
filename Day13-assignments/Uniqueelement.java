import java.util.*;
class Uniqueelement
  {
    public static void uniqueElement(int array[],int n)
    {
      int i=0;
      for(i=0;i<n;i++)
      {
        int j;
        for(j=0;j<i;j++)
          {
            if(array[i]==array[j])
             break;
            if(i==j)
            {
              System.out.println(array[i]);
            }
            for(i=0;i<n;i++)
        System.out.println(array[i]);
          }
          
       }
    
      }
    public static void main(String arg[])
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();
      int i;
      int array[]=new int[n];
       for(i=0;i<n;i++)
        {
           array[i]=s.nextInt();
        }
      uniqueElement(array,n);
    }
  }