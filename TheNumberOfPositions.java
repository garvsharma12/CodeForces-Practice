import java.util.Scanner;

public class TheNumberOfPositions
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int output = Math.min(n-a,b+1);
		System.out.println(output);

        sc.close();
	}
}


