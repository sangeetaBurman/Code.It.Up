import java.util.*;
class OddEven
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
if((a%2)==0 && a>0)
{
System.out.println("Even");
}
else if((a%2)!=0 && a>0)
{
System.out.println("Odd");
}
else
{
System.out.println("Invalid");
}
}
}