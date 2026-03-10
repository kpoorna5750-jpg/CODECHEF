import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int R1=sc.nextInt();
		    int R2=sc.nextInt();
		    int R3=sc.nextInt();
		    if((R1==R2)&&(R2==R3)){
		        System.out.println("No");
		    }
		    else if(R1>R2+R3){
		        System.out.println("Yes");
		        
		    }
		    else if(R2>R1+R3){
		        System.out.println("Yes");
		    }
		    else if(R3>R1+R2){
		        System.out.println("YEs");
		        
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
