import java.util.Scanner; 
public class odd_even
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter the number you want to check :");
n=s.nextInt();
if(n%2==0)
{
System.out.println(n+"number is even");
}
else
{
System.out.println(n+"number is odd");
}
}
}
