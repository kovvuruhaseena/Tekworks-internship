import java.util.*;
class First
  {
    public static void firstDigit(int num)
    {
      int l=0,f=0;
      l=num%10;
       System.out.println("the last is:"+l);
       
      while(num!=0)
        {
          f=num%10;
          num/=10;
        }
      System.out.println("the first is:"+f);
    }
    public static void main(String arg[])
    {
      int num;
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      firstDigit(num);
    }
  }