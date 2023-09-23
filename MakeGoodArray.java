import java.util.ArrayList;
import java.util.Scanner;

public class MakeGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n==1){
                int k = sc.nextInt();
                System.out.println(0); continue;
            }
            ArrayList<Long> arr = new ArrayList<>();
            for(int i=0 ;i<n ;i++) {
                long k = sc.nextInt();
                arr.add(k);
            }
            int count=0;
            for(int i=0 ;i<n ;){
                long k1 = arr.get(i) ; long k2 = arr.get(i+1);
                if((k1%2==0 && k2%2==0)|| (k1%2!=0 && k2%2!=0)){
                    long temp = k1*k2;
                    arr.remove(k2);
                    arr.set(i,temp);  count++;
                }
                else if((k1%2==0 && k2%2!=0)||(k1%2!=0 && k2%2==0)){
                    i++;
                }
                if(i==n-1) break;
            }
            System.out.println(count);
        }
    }
}
