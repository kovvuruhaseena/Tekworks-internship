
import java.util.Scanner;
import java.util.Random;


class choice
{
	int ch;
	Random rand=new Random();
	int computerChoice()
  {
		ch=rand.nextInt(3)+1;
		return ch;
	}
	int userchoice(Scanner scan)
	{
		System.out.println("enter your option");
		return scan.nextInt();
	}
	String chosenoption(int temp)
  {
		if (temp==1)
		 {
			 return "rock";
		 }
		 else if (temp==2)
		 {
			 return ("scissors");
		 }
		 else {
			 return "paper";
		 }
	}
}
 


  class Rock
 {  
    public static void main(String[] args)  
     {  
		  System.out.println("enter \n 1 for ''ROCK''\n 2 for ''SCISSORS''\n 3 for ''PAPER''");
		 String comOption="";
		 String userOption="";
		 String winner="tie";
		 choice c=new choice();
		 Scanner scan=new Scanner(System.in);
		 while(winner=="tie") 
     {
		 int temp1 = c.computerChoice();
		 comOption=c.chosenoption(temp1);
		 System.out.println("computer chooses     "+comOption);
		 int temp2 =c.userchoice(scan);
		 userOption=c.chosenoption(temp2);
		 System.out.println("user chooses        "+userOption);
		 if (comOption=="rock" && userOption=="paper" )
			 winner="user";
		 else if (comOption==userOption)
			 winner="tie";
		 else
			 winner="Computer";
		 if (comOption=="scissors" && userOption=="rock")
			 winner="user";
		 else if (comOption==userOption)
			 winner="tie";
		 else
			 winner="computer";
		 if (comOption=="paper" && userOption=="scissors")
			 winner="user";
		 else if (comOption==userOption)
			 winner="tie";
		 else
			 winner="computer";
		 }
		 System.out.println("'''"+"The Winner is "+"'''"+winner);
     }
 }