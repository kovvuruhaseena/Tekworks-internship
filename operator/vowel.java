import java.util.Scanner;
class vowel
{
  public static void main(String arg[])
    {
      char c;
     Scanner s=new Scanner(System.in);
     c=s.next().charAt(0);
     if(c=='a'|| c=='A' && c<'e' || c=='E' && c>'i' || c<'I'
        && c=='o' || c=='O' && c=='u' || c=='U')
       System.out.println("c is vowel");
    else
       System.out.println("c is consonant");
    }
  }