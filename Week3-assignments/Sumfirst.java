import java.util.*;
class Sumfirst
  {
    public static void firstDigit(int num)
    {
      int l=0,f=0,sum=0;
      l=num%10;
       while(num!=0)
        {
          f=num%10;
          num/=10;
          sum=f+l;
        }
      System.out.println("the sum is:"+sum);
    }
    public static void main(String arg[])
    {
      int num;
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      firstDigit(num);
    }
  }