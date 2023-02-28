import java.util.*;
class Reverse
  {
    public static void reverse(int m)
    {
      int n;
      int rev=0;
      while(m>0)
        {
          n=m%10;
          rev=(rev*10)+n;
          m=m/10;
        }
      System.out.println("reverse of the digits is:"+rev);
      }
    public static void main(String arg[])
    {
      int m;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      m=s.nextInt();
      reverse(m);
    }
  }