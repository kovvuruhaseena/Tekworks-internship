 import java.util.*;
 class Calculator
  {
    public static void main(String arg[])
    {
      int num1,num2;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the values of num1 and num2");
      num1=s.nextInt();
      num2=s.nextInt();
      char option;
      do
      {
          System.out.println("Arthematic operations");
          System.out.println("+:Addition");
          System.out.println("-:Substraction");
          System.out.println("*:Multiplication");
          System.out.println("/:Division");
          System.out.println("%:Modulo");
          System.out.println("which operation do you want perform");
           char operators=s.next().charAt(0);
           Calculator c=new Calculator();
          switch(operators)
            {
              case '+':
                int addresult=c.addition(num1,num2);
                 System.out.println(addresult);
                break;
              case '-':
                int subresult=c.substraction(num1,num2);
                 System.out.println(subresult);
                break;
              case '*':
                int mulresult=c.multiplication(num1,num2);
                 System.out.println(mulresult);
                break;
              case '/':
                int divresult=c.division(num1,num2);
                System.out.println(divresult);
                break;
              case '%':
                int modresult=c.modulo(num1,num2);
                System.out.println(modresult);
                break;
            }
             System.out.println("do you want perform one more operation");
             option=s.next().charAt(0);
         }
          while(option!='n');
    }
    int addition(int num1,int num2)
    {
      return num1+num2;
    }
    int substraction(int num1,int num2)
    {
      return num1-num2;
    }
    int multiplication(int num1,int num2)
    {
      return num1*num2;
    }
    int division(int num1,int num2)
    {
      return num1/num2;
    }
    int modulo(int num1,int num2)
    {
      return num1%num2;
    }
  }
    
     
    
                
             
         
      
        
      
  
                
            
          
          
        
      
  