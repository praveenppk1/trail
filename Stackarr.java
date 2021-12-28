import java.util.*;
public class Stackarr{
static int top=-1,MAX=5,i,stack[];
static Scanner sc;

public static void push(int ele)
{
if(top>=MAX-1)
{
System.out.println("stack is full and overflow");
}
else
{
top=top+1;
stack[top]=ele;
}
}
public static void pop()
{
if(top==-1)
{
System.out.println("stack is empty and underflow");
}
else
{
System.out.println("deleted is"+stack[top]);
top=top-1;
}
}
public static void display()
{
if(top==-1)
{
System.out.println("stack is empty");
}
else
{
System.out.println("elements are");
for(i=top;i>=0;--i)
{
System.out.println(stack[i]);
}
}
}
public static void main (String []args)
{
int ele,ch;
sc=new Scanner(System.in);
stack=new int[MAX];
do
{
System.out.println("menu is \n 1.push \n 2.pop \n 3. display \n 4.exit");
System.out.println("enter the choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("enter element");
ele=sc.nextInt();
push(ele);
break;
case 2:
pop();
break;
case 3:
display();
}
}while(ch<=3);
}
}



