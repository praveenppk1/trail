import java.util.*;
public class CircualrQ{
	static int front=-1,rear=-1,cq[],size=5,i;
	static Scanner s;
	public static void insert(int ele){
		if(((front== 0) && (rear == size-1))||(front==rear+1))
			System.out.println("queue is full");
		else{
			if(front==-1)
				++front;
			if(rear==size-1)
				rear=0;
			else
				++rear;
			cq[rear]=ele;
		}
	}
	public static void delete(){
		if(front==-1)
			System.out.println("empty");
		else{
			System.out.println("deleted is "+cq[front]);
			if(front==rear)
				front=rear=-1;
			else if(front==size-1)
				front=0;
			else
				front++;
		}
	}
	public static void display(){
		if(front==-1)
			System.out.println("empty");
		else{
			int f=front,r=rear;
			if(f<=r){
				while(f<=r)
					System.out.println(cq[f++]);
			}
			else{
				while(f<=size-1)
					System.out.println(cq[f++]);
				f=0;
				while(f<=r)
					System.out.println(cq[f++]);
			}
		}
	}
	public static void main(String[]args){
		int ch,ele;
		s=new Scanner(System.in);
		cq=new int[size];
		do{
			System.out.println("menu is 1.insert 2.delete 3.diaplay 4.exit");
			ch=s.nextInt();
			switch(ch){
				case 1: System.out.println("enter the element");
						ele=s.nextInt();
						insert(ele);
						break;
				case 2:
						delete();
						break;
				case 3:
						display();
		    }
	    }while(ch<=3);
    }
}
			
		