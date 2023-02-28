import java.util.*;
class SecondMaxMin
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
       secondElement(array,n);
    }
    public static void secondElement(int array[],int n)
    {
      int first_max=array[0];
      int second_max=array[0]; 
       int first_min=array[0];
     int second_min=array[0];
      for(int i=0;i<n;i++)
        {
          if(first_max<array[i])
          {
                 first_max=array[i];
           second_max=first_max;
          }
         if(first_min>array[i])
          {
            first_min=array[i];
          }
          if(second_min>array[i]&&array[i]!=first_min)
          {
            second_min=array[i];
          }
        }
           System.out.println(second_max);
         System.out.println(second_min);
         
   
       }
           
      }
        
    
  