import java.util.Scanner;
class alphabet
{
  public static void main(String arg[])
    {
      char c;
     Scanner s=new Scanner(System.in);
     c=s.next().charAt(0);
     if(c>'a' && c<'z' || c>'A' && c<'Z')
       System.out.println("char is alphabet");
    else
       System.out.println("num is not a ");
    }
  }