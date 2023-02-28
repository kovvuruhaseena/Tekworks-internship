import java.util.*;
class Lowertriangle
  {
    public static void lowerTriangle(int array[][],int r,int c)
    {
      
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              if(i>j)
              {
                System.out.println(array[i][j]+"");
              }
            }
          }
    }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the array row size");
      int r=s.nextInt();
      System.out.println("enter the array column size");
      int c=s.nextInt();
      int array[][]=new int[r][c];
      System.out.println("enter array elements");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
         lowerTriangle(array,r,c);
    }
  }