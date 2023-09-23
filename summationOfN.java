import java.util.Scanner;

public class summationOfN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int sum=0 , k=0;
		//System.out.println(sum);
	}
	public static void Call(int sum , int t){
		if(t==0){
            System.out.println(sum);
            return;
        }
		Call(sum+t,t-1);
	}
}