//CLL
import java.util.Scanner;

public class Circular{
static Node header,t,p;
static Scanner sc;
static class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
}
}

public static Circular insert(Circular list,int ele)
{
int ch,j,r;
Node temp=new Node(ele);
if(header==null)
{
temp.next=temp;
header=temp;
}
else
{
p=header;
System.out.println("1.START\n2.MIDDLE\n3.END");
System.out.println("Enter your choice ");
ch=sc.nextInt();
switch(ch)
{
case 1: temp.next=header;
while(p.next!=header)
{
p=p.next;
}
p.next=temp;
header=temp;
break;
case 2: System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j)
{
t=p;
p=p.next;
}
t.next=temp;
temp.next=p;
break;
case 3: while(p.next!=header)
{
p=p.next;}
p.next=temp;
temp.next=header;
}
}
return list;
}

public static Circular delete(Circular list)
{
int ch,j,r;
if(header==null)
{
System.out.println("List is empty");
}
else
{
p=header;
System.out.println("1.START\n2.MID\n3.END");
ch=sc.nextInt();
switch(ch)
{
case 1: if(p.next==header)
{
System.out.println("Deleted is "+p.data);
header=null;
}
else{
System.out.println("Deleted is "+p.data);
while(p.next!=header)
{
p=p.next;
}
header=header.next;
p.next=header;
} 
break;
case 2:if(p.next==header)
{
System.out.println("Deleted is "+p.data);
header=null;
}
else
{
System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j)
{
t=p;
p=p.next;
}
System.out.println("Deleted is "+p.data);
t.next=p.next;
}
break;
case 3: if(p.next==header)
{
System.out.println("Deleted is "+p.data);
header=null;
}
else
{
while(p.next!=header)
{
t=p;
p=p.next;
}
System.out.println("Deleted is "+p.data);
t.next=header;
}
}
}
return list;
}

public static void display(Circular list){
if(header==null)
{
System.out.println("List is empty");
}
else
{
p=header;
while(p.next!=header)
{
System.out.print(p.data+"->");
p=p.next;
}
System.out.println(p.data);
System.out.println();
}
}

public static void main(String[] args)
{
Circular list=new Circular();
sc=new Scanner(System.in);
int ch,ele;
do
{
System.out.println("1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
System.out.println("Enter your choice ");
ch=sc.nextInt();
switch(ch)
{
case 1: System.out.println("Enter element ");
ele=sc.nextInt();
list=insert(list,ele);
break;
case 2 : list=delete(list);
break;
case 3: display(list);
}
}while(ch<=3);
}
}