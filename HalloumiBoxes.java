import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean boo = false;
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0 ; i<n ;i++){
                arr[i]=sc.nextInt();
                if(i>0 && arr[i-1]<=arr[i]) boo=true;
                hm.put(arr[i],i+1);
            }
            if(boo){
                System.out.println("YES");
                continue;
            }
            int[] copy = Arrays.copyOfRange(arr, 0, n);
            Arrays.sort(copy);
            boolean b = true;
            for(int i=0 ;i<n;i++){
                if(Math.abs((i+1)-hm.get(copy[i]))>=k){
                    b=false;
                    System.out.println("NO");
                    break;
                }
            }
            if(b) System.out.println("YES");
            //System.out.println(Arrays.toString(copy));
        }
    }
}
