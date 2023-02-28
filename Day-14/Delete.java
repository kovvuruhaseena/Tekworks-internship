import java.util.*;
class Delete
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();
      int pos=s.nextInt();
      int array[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
         array[i]=s.nextInt();
        }
      delete(array,n,pos);
    }
      
      public static void delete(int array[],int n,int pos)
        {
          Scanner s=new Scanner(System.in);
        int dupli[]=new int[n-1];
        for(int i=0;i<n-1;i++)
          {
            if(i<pos-1)
            {
              dupli[i]=array[i];
            }
            else
            dupli[i]=array[i+1];
          }
        for(int i=0;i<n-1;i++)
          {
            System.out.print(dupli[i] +" ");
          }
  }
}

    

  