import java.util.*;
class Diagonalmatrix
  {
    static void diagonalmatrix(int array[][],int a,int b)
    {
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              if(i==j)
              {
                System.out.println(array[i][j]+",");
              }
            }
        }
      }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter row size: ");
      int a=s.nextInt();
      System.out.println("enter column size: ");
      int b=s.nextInt();
      int array[][]=new int[a][b];
      System.out.println("enter array elements");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
      diagonalmatrix(array,a,b);
    }
  }