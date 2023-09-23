import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class OddSet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int odd=0 , even=0;
                int[] arr = new int[2*n];
                Set<Integer> s1 = new HashSet<>();
                Set<Integer> s2 = new HashSet<>();
                for(int i=0 ; i<2*n ;i++)
                {
                    arr[i]=sc.nextInt();
                    if(arr[i]%2==0) s1.add(arr[i]);
                    else s2.add(arr[i]);

                    if(arr[i]%2==0) even++;
                    else odd++;
                }
                if(odd!=n && even !=n) System.out.println("No");
                else System.out.println("Yes");
            }
        }
    }
}
