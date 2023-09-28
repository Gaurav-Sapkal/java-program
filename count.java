


public class count 
{
public static void main(String [] args)
{

count(5);

}
public static void count(int  n)
{
if(n==1){
System.out.println(n);
return ;
}
System.out.println(n);
count(n-1);

}
}
