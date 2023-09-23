import java.util.Scanner;
public class GCDSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			long n = sc.nextLong();
			long num =n;
			long sum =0;
			while(num!=0)
			{
				sum+=num%10;
				num=num/10;
			}
			while(true)
			{
				if(sum%2==0 && n%2==0) System.out.println(n);
				else if(sum%3==0 && n%3==0) System.out.println(n);
				else  
				{
					
				}
			}
		}
		
	}
}
