import java.util.*;
class PositiveNegativeZero
{
public static void main(String args[])
{
int a;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a>0)
{
System.out.println("Positive");
}
elseif(a<0)
{
System.out.println("Negative");
}
else
{
System.out.println("Zero");
}

}
}