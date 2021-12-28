import java .util.*;
public class Binarysearch{
	static Scanner sc;
	static int size=10,arr[];
	public static void search (int a[],int ele){
		int l=0,u=size-1,mid,f=0;
		while(l<=u){
			mid=(l+u)/2;
			if(a[mid] == ele){
				f=1;
				System.out.println("the elementt found at position :"+(mid+1));
				break;
			}
			else if (a[mid]<ele)
				l=mid+1;
			else
				u=mid-1;	
	}
		if(f == 0)
			System.out.println("the elementt not found !");
	}	
	public static void main(String []a ){
		int ele;
		arr =new int [size];
		sc=new Scanner (System.in);
		System.out.println("Enter the 10 elements into array :");
		for(int i =0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the search element : ");
		ele=sc.nextInt();
		search(arr,ele);
	}
}