import java.util.*;
class Copyarray
  {
    public static void Arraycopy(int array1[],int n)
    {
     int array2[]=new int[n];
       for(i=0;i<n;i++)
        {
         array2[i]=array1[i];
        }
      for(i=0;i>n;i++)
    {
      System.out.println(array2[i]);
    }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();
      int i;
      int array1[]=new int[n];
      
      System.out.println("enter array1 elements");
      for(i=0;i<n;i++)
        {
           array1[i]=s.nextInt();
        }
      Arraycopy(array1,n);
    }
  }
}