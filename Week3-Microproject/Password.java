import java.util.*;
class Password
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
        Random r=new Random();
      String pas="";
      int length=s.nextInt();
      for(int i=0;i<length;i++)
        {
          pas+=r.nextInt(0,10);
        }
      System.out.println(pas.toString());
    }
  }