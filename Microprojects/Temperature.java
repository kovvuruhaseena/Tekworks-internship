import java.util.*;
public class Temperature 
{
float C_to_F(float temp)
{
	return ((temp-32)*5)/9;
}
float F_to_C(float temp)
{
	return ((temp*9)/5)+32;
}
public static void main(String []args) 
  {
	Scanner s=new Scanner(System.in);
	Temperature obj=new Temperature();
	float temp=s.nextFloat();
	System.out.println(obj.C_to_F(temp));
	System.out.println(obj.F_to_C(temp));
	}
}