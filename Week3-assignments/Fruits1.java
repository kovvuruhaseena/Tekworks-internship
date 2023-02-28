import java.util.*;
class Fruits1
  {
    public static void main(String arg[])
    { 
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of weight in array");
      int size;
      size=s.nextInt();
      int arrayweight[]=new int[size];
      System.out.println("enter array weight");
      for(int i=0;i<=size-1;i++)
        arrayweight[i]=s.nextInt();
      displayarrayweight(arrayweight,size);
    }
    public static void displayArrayweight(int arrayweight,int size)
    {
      for(int h:arrayweight)
      System.out.println(arrayweight);
    }
  }
  