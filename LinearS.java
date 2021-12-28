import java.util.*;
public class LinearS{
	static int i,a[],max=5,key,temp=0;
	static Scanner s;
	public static void Search(int a[],int key){
		for(i=0;i<max;i++)
		{
			if(a[i]==key){
				System.out.println("element is found");
			temp=1;
			break;
			}
		}
	
	if(temp==0)
		System.out.println("NOt found");
	}
	public static void main(String args[]){
		s=new Scanner(System.in);
		a=new int[max];
		System.out.println("enter the element");
		for(i=0;i<max;i++)
			a[i]=s.nextInt();
		System.out.println("enter the key");
		key=s.nextInt();
		Search(a,key);
		}
}