import java.util.*;
class ElementCount
  {
    public static void evenOodCount(int array[],int n)
    {
      int even_count=0;
      int ood_count=0;
      for(int i=0;i<n;i++)
        {
          if(array[i]%2==0)
          {
            even_count++;
          }
          else
          {
            ood_count++;
          }
        }
          System.out.println("number of even  elements = "+ even_count + " \nood number of elements = " + ood_count);
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
      evenOodCount(array,n);
    }
  }