import java.util.Scanner;
class positive
{
  public static void main(String arg[])
    {
     int num;
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     if(num>0)
       System.out.println("num is positive ");
      else if(num<0)
       System.out.println("num is negative");
      else
        System.out.println("num is equal to zero");
    }
  }