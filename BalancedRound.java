import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0 ;i<n ; i++) arr.add(sc.nextInt());

            Collections.sort(arr);
            int mx=0;
            int cout=0;
            for(int i=0 ;i<n-1 ;i++){
                cout++;
                if(Math.abs(arr.get(i)-arr.get(i+1))>k){
                    mx=Math.max(cout,mx); cout=0;
                }
            } 
            mx=Math.max(cout+1,mx);
            System.out.println(n-mx);
        }
    }
}
