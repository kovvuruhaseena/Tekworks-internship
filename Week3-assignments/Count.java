import java.util.*;
class Count
  {
    public static void countDigits(int num)
    {int count=0;
      while(num!=0)
        {
          num=num/10;
          count++;
        }
      System.out.println("number of digits in the given integer::"+count);
    }
    public static void main(String arg[])
    {
      int num;
      
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      num=s.nextInt();
      countDigits(num);
    }
  }