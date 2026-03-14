import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		boolean found =false;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if (arr[i]==x){
		        found=true;
		    }
		}
		if(found){
		    System.out.println("Yes");
        }
		
		else{
		    System.out.println("NO");
		}
		

	}
}
