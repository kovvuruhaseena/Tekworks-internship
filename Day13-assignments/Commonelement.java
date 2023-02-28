import java.util.*;
class Commonelement
{
 public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array1 row size");
      int r=s.nextInt();
      System.out.println("enter array1 col size");
      int c=s.nextInt();
      System.out.println("enter array2 row size");
      int r1=s.nextInt();
      System.out.println("enter array2 col size");
      int c1=s.nextInt();
      int array1[][]=new int[r][c];
      int array2[][]=new int[r1][c1];
      System.out.println("enter array1 elements");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              array1[i][j]=s.nextInt();
              
            }
        }
      System.out.println("enter array2 elements");
      {
        for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c1;j++)
              {
                array2[i][j]=s.nextInt();
              }
          }
      
      }
      commonElements(array1,array2,r,c,r1,c1);
    }
  public static void commonElements(int array1[][],int array2[][],int r,int c,int r1,int c1)
  {
    for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          {
        if(array1[i]==array2[i])
        {
          System.out.println(array1[i]);
        }
      }
  }
}
}