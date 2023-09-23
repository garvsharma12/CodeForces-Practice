import java.util.Scanner;

public class CLanguage {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		while(loop-->0)
		{
		int a = sc.nextInt();
		int b= sc.nextInt();
		int n= sc.nextInt();
		int count=0;
		
		while((a<=n)||(b<=n))
		{
		    if(a<n)
		    {
		    a+=b;
		    count++;
		    }
		    if(a>n)
		        break;
		        
		    if(b<n)
		    {
		    b+=a;
		    count++;
		    }
		    if(b>n) 
		        break;
		}
		
		System.out.println(count);
		}
		sc.close();
	}
}

