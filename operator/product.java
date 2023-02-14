import java.util.Scanner;
class product
  {
    public static void main(String arg[])
    {
      String product_name;double product_price;
      double product_sellingprice;
      Scanner s=new Scanner(System.in);
      product_name=s.next();
      product_price=s.nextDouble();
      product_sellingprice=product_price*0.1;
      System.out.println("product name is "+product_name);
      System.out.println("product price is "+product_price);
  System.out.println("productsellingpriceis"+product_sellingprice);
      }
  }