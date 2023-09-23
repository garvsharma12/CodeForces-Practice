import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long sum = 0;
            ArrayList<Long> arr = new ArrayList<>(n);
            for(int i=0 ; i<n ; i++) {
                long temp = sc.nextLong();
                sum+=temp;
                arr.add(temp);
            }
            System.out.println(sum);
            Collections.sort(arr);
            System.out.println(arr);
            while(k>0){
                long a = arr.get(0) , b = arr.get(1) , z = arr.get(arr.size()-1);
                if(a+b<z){
                    sum-=(a+b);
                    arr.remove(Long.valueOf(a)); arr.remove(Long.valueOf(b));
                    k--;
                }
                else {
                    sum-=z;
                    arr.remove(Long.valueOf(z));
                    k--;
                }
                System.out.println(arr);
                System.out.println(sum+"!");
            }
            System.out.println(sum);
        }
    }
}
