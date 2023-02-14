import java.util.Scanner;
class even
{
  public static void main(String arg[])
    {
     int num;
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     if(num%2==0)
       System.out.println("num is even");
    else
        System.out.println("num is odd");
    }
  }