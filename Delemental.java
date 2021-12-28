import java.util.*;
public class Delemental
{
static int top=-1,i;
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
int c1=0,c2=0;
String str;
s=new Scanner(System.in);
str=s.next();
stack=new char[str.length()];
for(i=0;i<str.length();i++)
push(str.charAt(i));
for(i=0;i<str.length();i++)
{
char c=pop();
if(c=='(')
c1++;
if(c==')')
c2++;
}
if(c1==c2)
System.out.println("symbols are balanced");
else
System.out.println("not balanced");
}
}