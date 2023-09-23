import java.util.ArrayList;
import java.util.Scanner;
public class Cherry {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n =sc.nextInt();
                ArrayList<Long> arr = new ArrayList<>();
                for(int i=0;i<n ;i++) arr.add(sc.nextLong());
                long mx =0;
                for(int i=0  ; i<n-1 ;i++)
                    mx=Math.max(mx,arr.get(i)*arr.get(i+1));
                System.out.println(mx);
            }
        }
    }
}
