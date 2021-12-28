import java.util.*;
public class Stackll
{
static Node top,p;
static Scanner s;
static class Node
{
int data;
Node next;
Node (int data)
{
this.data=data;
}
}
public static void push(int ele)
{
Node temp=new Node(ele);
if(top==null)
{
temp.next=top;
top=temp;
}
else
{
temp.next=top;
top=temp;
}
}
public static void pop()
{
if(top==null)
System.out.println("stack is empty");
else
{
p=top;
System.out.println("deleted is "+p.data);
top=top.next;
}
}
public static void display()
{
if(top==null)
{
System.out.println("stack is empty");
}
else
{
p=top;
System.out.println("elements are");
while(p!=null)
{
System.out.println(p.data);
p=p.next;
}
}
}
public static void main (String [] args)
{
s=new Scanner(System.in);
int ele,ch;
do
{
System.out.println("menu is\n 1.PUSH \n2.POP \n3.DISPLAY \n 4.EXIT");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("enter element");
ele=s.nextInt();
push(ele);
break;
case 2:
pop();
break;
case 3:
display();
break;
}
}while(ch<3);
}
}
