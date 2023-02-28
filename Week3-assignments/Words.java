import java.util.*;
class Words
  {
    public static void words(int num)
    {
      int r=0;
      while(num>0)
      {
        r=num%10;
      switch(r)
        {
          case 1:
            System.out.println("one");
            break;
          case 2:
            System.out.println("two");
            break;
          case 3:
            System.out.println("three");
            break;
          case 4:
            System.out.println("four");
            break;
          default:
            System.out.println("invalid");
       }
        num=num/10;
      }
    }
    public static void main(String arg[])
    {
      int num;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      num=s.nextInt();
      words(num);
    }
  }