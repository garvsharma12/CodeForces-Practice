import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PoweringtheHero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long tt = sc.nextLong();
            while(tt-->0){
                int n= sc.nextInt();
                long out=0 , temp=0;
                ArrayList<Long> stk = new ArrayList<>();
                long[] arr = new long[n];
                for(int i=0 ;i<n ; i++){
                    arr[i]=sc.nextInt();
                    
                    if(arr[i]==0 && i==0) 
                        continue;
                    else if(arr[i]!=0) stk.add(arr[i]);
                    else if(arr[i]==0 && stk.size()==0) continue;
                    else if(arr[i]==0){
                        temp=Collections.max(stk);
                        out+=temp;
                        stk.remove(Long.valueOf(temp));
                    }
                }
                System.out.println(out);
            }
        }
    }
}
