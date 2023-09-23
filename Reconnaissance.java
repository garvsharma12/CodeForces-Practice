import java.util.Scanner;

public class Reconnaissance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		    arr[i]=sc.nextInt();
		    
		int mn = Math.abs(arr[0]-arr[1]);
		int indx1=1 , indx2=2;
		for(int i=1 ; i<n-1 ; i++)
		{
		    if(Math.abs(arr[i]-arr[i+1])<mn)
		    {
		        indx1=i+1;
		        indx2=i+2;
		        mn=Math.abs(arr[i]-arr[i+1]);
		    }
		}
		int mn2 = Math.abs(arr[n-1]-arr[0]);
		if(mn2<mn)
		{
		    System.out.println(n+" "+1);
		}
		else 
		    System.out.println(indx1+" "+indx2);
		

        sc.close();

    }
}
