import java.util.*;
class Digitsum
  {
    public static void digitSum(int m)
    {
      int n;
      int sum=0;
      while(m>0)
        {
          n=m%10;
          sum=sum+n;
          m=m/10;
        }
      System.out.println("sum of the digit is:"+sum);
      }
    public static void main(String arg[])
    {
      int m;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      m=s.nextInt();
      digitSum(m);
    }
  }