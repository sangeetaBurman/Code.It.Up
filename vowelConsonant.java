import java.util.*;
class vowelConsonant
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an alphabet");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| 
ch=='o'|| ch=='O'|| ch=='u'|| ch=='U')
{
System.out.println("Vowel");
}
else if(ch>='a' && ch<='z')
{

System.out.println("Consonant");
}
else 
{
System.out.println("Invalid");
}
}
} 