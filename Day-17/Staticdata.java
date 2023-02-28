import java.util.*;
class Staticdata
  {
    public static void main(String arg[])
    {
      int array[]={0,1,0,0,2,1,1,2,};
      int size=8;
      staticData(array,size);
    }
    
    public static void staticData(int array[],int size)
    {
      
      String s1=" ";
      String s2=" ";
      String s3=" ";
      for(int i=0;i<size;i++)
        {
          if(array[i]==0)
          {
            s1=s1+0;
          }
          else if(array[i]==1)
          {
            s2=s2+1;
          }
          else s3=s3+2;
          }
       System.out.println(s1+s2+s3);
          
  }
  }