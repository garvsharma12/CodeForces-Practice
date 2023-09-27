/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		    int tt = sc.nextInt();
		    while(tt-->0){
		        int n = sc.nextInt();
                long temp=1;
                long[] arr = new long[n];
		        for(int i=0 ;i<n ;i++){ 
                    if(i%2==0&&i!=0){
                        arr[i]=arr[i-1]+arr[i-2]-1;
                        temp=arr[i];
                        System.out.print(arr[i]+" ");
                    }
                    else{
                        arr[i]=temp+1;
                        System.out.print(arr[i]+" ");
                        temp++;
                    }
		        }
                System.out.println();
                
		    }
	}	    
}   