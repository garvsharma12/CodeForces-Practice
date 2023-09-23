import java.util.Scanner;
public class Main{
public static void main(String[] args){
	
	try (Scanner sc = new Scanner(System.in)) {
        int tt = sc.nextInt();
        while(tt-->0){
        	long a=0 , b=0 , x=0;
        	a = sc.nextLong();
        	b= sc.nextLong();
        	x = sc.nextLong();
        	if(a>b){
        	    long temp = a;
        	    a=b;
        	    b=temp;
        	}
        	int cnt=0;
        	while(Math.max(a,b)<=x){
        		a+=b;
        		long temp = a;
        	    a=b;
        	    b=temp;
        		cnt++;
        	}
        	System.out.println(cnt);
        }
    }
    }
}