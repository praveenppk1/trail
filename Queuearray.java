import java.util.*;
public class Queuearray
{
static int front=-1,rear=-1,max=5,queue[],i;
static Scanner sc;
public static void enqueue(int ele)
{
if(rear>=max-1)
System.out.println("Queue is full");
else
{
if(front==-1)
++front;
queue[++rear]=ele;
}
}
public static void dequeue()
{
if(front==-1||front>rear)
System.out.println("Empty");
else
{
System.out.println("Deleted -  "+queue[front++]);
}
}
public static void display()
{
if(front==-1||front>rear)
System.out.println("Empty");
else
{
System.out.println("Elements are ");
for(i=front;i<=rear;i++)
System.out.println(queue[i]);
}
System.out.println("\n");
}
public static void main(String args[])
{
int ch,ele;
sc=new Scanner(System.in);
queue=new int[max];
do
{
System.out.println("Menu is \n1.Enqueue\n2.Deuqeue\n3.Display\n4.Exit");
ch=sc.nextInt();
switch(ch)
{ case 1:System.out.println("Enter element");
ele=sc.nextInt();
enqueue(ele);
break;
case 2:dequeue();
break;
case 3:display();
}
}
while(ch<=3);
}
}
