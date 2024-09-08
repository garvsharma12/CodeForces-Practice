import java.util.*;
public class ArrayDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long sqSum=(n*(n+1)*(2*n+1))/6;
            sqSum-=1;
            int x=1;
            while((x+sqSum)%n!=0){
                x++;
            }
            System.out.print(x+" ");
            x=2;
            while(x!=n+1){
                long num = (long)Math.pow(x,2);
                System.out.print(num+" ");
                x++;
            }
            System.out.println();
        }   
    }
}
