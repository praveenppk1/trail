import java.util.*;
public class Stackrr
{
static int top=-1,i,ele;
static char stack[];
static Scanner s;
public static void push(char ele)
{
stack[++top]=ele;
}
public static char pop()
{
return (stack[top--]);
}
public static void main(String []args)
{
String str1,str2=" ";
s=new Scanner(System.in);
str1=s.next();
stack=new char[str1.length()];
for(i=0;i<str1.length();i++)
push(str1.charAt(i));
for(i=0;i<str1.length();i++)
str2+=pop();
System.out.println("the reverse string is"+str2);
}
}
