import java.util.Scanner;
public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k=2;
            while(n-->0)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
