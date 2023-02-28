 import java.util.Scanner;
class Addmatrix
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter row(a) size: ");
      int a=s.nextInt();
      System.out.println("enter column(b) size: ");
      int b=s.nextInt();
      System.out.println("enter row(a1) size: ");
      int a1=s.nextInt();
      System.out.println("enter column(b) size: ");
      int b1=s.nextInt();
       int array1[][]=new int[a][b];
       int array2[][]=new int[a1][b1];
      System.out.println("enter array1 elements: ");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              array1[i][j]=s.nextInt();
            }
        }
      System.out.println("enter array2 elements: ");
      for(int i=0;i<a1;i++)
        {
          for(int j=0;j<b1;j++)
            {
              array2[i][j]=s.nextInt();
            }
        }
      addmatrix(array1,array2,a,b,a1,b1);
    }
    public static void addmatrix(int array1[][],int array2[][],int a,int b,int a1,int b1)
    {
      int c[][]=new int[a][b];
      System.out.println("the array c elements is");
      for(int i=0;i<a;i++)
        {
           for(int j=0;j<b;j++)
             {
               c[i][j]=array1[i][j]+array2[i][j];
               System.out.print(c[i][j]+" ");
             }
          System.out.println();
        }
       
    }
  }
 