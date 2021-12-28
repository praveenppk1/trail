import java.util.*;
public class PriortyQ{
	static Scanner sc;
	static Node f,r,temp,p;
	static class Node{
		int data,pri;
		Node next;
		Node(int data,int pri){
			this.data=data;
			this .pri=pri;
		}
	}
	public static void insert(int d,int pr){
		Node temp=new Node(d,pr);
		if (f== null || f.pri> pr){
			if (f== null)
				r=temp;
			temp.next=f;
			f=temp;
		}
		else{
			p=f;
			while(p.next != null && p.next.pri < pr)
				p=p.next;
			temp.next=p.next;
			p.next=temp;
			if(p.next == null)
				r=temp;
		}
	}
	public static void delete(){
		if(f== null){
			
		System.out.println("Queue is empty !");
		}
		else{
			System.out.println("the seleted element is : "+f.data);
			f=f.next;
		}
	}
	public static void display(){
		p=f;
		while(p !=null){
			System.out.println("the seleted element is : "+p.data);
			p=p.next;
		}
	}
	public static void main(String[]art){
		int ele,pri,ch;
		sc=new Scanner (System.in);
		do{
			System.out.println("Enetr your choice 1. insert 2.delete 3. display 4.exit  ");
			
			ch=sc.nextInt();
			switch(ch){
				case 1:System.out.println("Enter the  element : ");
				ele=sc.nextInt();
				System.out.println("Enter the priority :");
				pri=sc.nextInt();
				insert(ele,pri);
				break;
				case 2:
				delete();
				break;
				case 3:
				display();
				break;
			}
		}while(ch<=3);
	}
}