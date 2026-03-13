import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];    
		    int count=0;
		
		    for(int i=0; i<n ;i++){
		        arr[i]=sc.nextInt();
	    	}
		    for(int i=0; i<n ;i++){
		        if(arr[i]>=1000)
		            count++;
	    	}
		    System.out.println(count);
		
		    
		

	    }
    }
}
