import java.util.*;
public class DoubleQ{
	static int size=5,front=size,rear=size,i,dq[];
	static Scanner s;
	public static void enqueue(int ele){
		if(rear==0)
			System.out.println("full");
		else{
			if(front==size)
				front--;
			dq[--rear]=ele;
		}
	}
	public static void dequeue(){
		if(front==size || front<rear)
			System.out.println("mt");
		else{
			System.out.println("deleted is"+dq[front]);
			if(front==rear)
				front=rear=size;
			else
				front--;
		}
	}
	public static void display(){
		if(front==size || front<rear)
			System.out.println("Q is empty");
		else{
			System.out.println("elements are");
			for(i=front;i>=rear;i--)
				System.out.println(dq[i]);
		}
	}
	public static void main(String []args){
		int ch,ele;
		s=new Scanner(System.in);
		dq=new int[size];
		do{
			System.out.println("menu is 1.insert 2.delete 3.diaplay 4.exit");
			ch=s.nextInt();
			switch(ch){
				case 1: System.out.println("enter the element");
						ele=s.nextInt();
						enqueue(ele);
						break;
				case 2:
						dequeue();
						break;
				case 3:
						display();
		    }
	    }while(ch<=3);
    }
}
			