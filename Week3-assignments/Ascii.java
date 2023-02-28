import java.util.Scanner;
  public class Ascii 
  {
	public static void Ascii(char ch) 
  {
    if(ch>='A'&&ch<='Z')
    {
     System.out.println((int)ch); 
    }
  }
    public static void main(String arg[])
    {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any alphabet");
    ch=sc.next().charAt(0);
    Ascii(ch);
    }
  }