//DLL
import java.util.*;
public class Linked1{
static Scanner sc;
static Node header,p,p1,t;
static class Node{
int data;
Node pre;
Node next;
Node(int data){ 
this.data=data;
}
}
public static Linked1 insert(Linked1 list,int ele)
{
int ch,j,r;
Node temp=new Node(ele);
if(header==null){
temp.next=null;
temp.pre=null;
header=temp;
} 
else
{
p=header;
System.out.println("1.START\n2.MID\n3.END");
ch=sc.nextInt();
switch(ch){
case 1 : temp.next=header;
header.pre=temp;
header=temp;
break;
case 2: System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j){
t=p;
p=p.next;
}
t.next=temp;
temp.pre=t;
temp.next=p;
p.pre=temp;
break;
case 3 : while(p.next!=null){
p=p.next;
}
p.next=temp;
temp.pre=p;
temp.next=null;
break;
}
}
return list;
}

public static Linked1 delete(Linked1 list)
{
int ch,j,r;
if(header==null){
System.out.println("List is empty");
}
else
{
p=header;
System.out.println("1.START\n2.MID\n3.END");
System.out.println("Enter your choice ");
ch=sc.nextInt();
switch(ch){
case 1:   header=header.next;
          header.pre=null;
break;
case 2: System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j){
t=p;
p=p.next;
p1=p.next;
}
t.next=p1;
p1.pre=t;
break;
case 3 : while(p.next!=null){
t=p;
p=p.next;
}
t.next=null;
}
}
return list;
}
public static void display(Linked1 list){
if(header==null){
System.out.println("List is empty");
}
else
{
p=header;
while(p!=null){
System.out.print(p.data+"->");
p=p.next;
}
System.out.println();
p=header;
while(p.next!=null){
p=p.next;
}
while(p!=null){
System.out.print(p.data+"<-");
p=p.pre;
}
System.out.println();
}
}
public static void main(String[] args){
sc=new Scanner(System.in);
Linked1 list=new Linked1();
int ch,ele;
do{
System.out.println("1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
System.out.println("Enter choice ");
ch=sc.nextInt();
switch(ch){
case 1: System.out.println("Enter an element ");
ele=sc.nextInt();
list=insert(list,ele);
break;
case 2: list=delete(list); break;
case 3: display(list); break;
}

}while(ch!=4);
}
}