import java.util.Scanner;
class division
{
  public static void main(String arg[])
    {
     int num;
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     if(num%5==0 && num%11==0)
       System.out.println("num is divisible by 5 and 11");
    else
        System.out.println("num is not divisible by 5 and 11");
    }
  }