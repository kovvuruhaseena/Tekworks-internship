import java.util.*;
class Guess
{
	public static void main(String args[] )
	{
		guessNumber();
  }
  public static void guessNumber()
  {
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
		int num=rand.nextInt(100);
    while(sc.nextInt()!=num)
		{
			if (guess<num)
				System.out.println("too low");
			else
				System.out.println("too high");
		}
		System.out.println("Congratulations!!!! you enterd correctly ");
	}
 }