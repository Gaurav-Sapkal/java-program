public class printnoASD
  {
public static void main(String []args)
    {
      countASD(5);
    }

public static void countASD(int n)
    {
if(n==0)
{
  return;
}
countASD(n-1);
System.out.println(n);
    }
  }
      
