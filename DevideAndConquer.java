import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevideAndConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            long sum=0 ,out=Integer.MAX_VALUE; 

            for(int i=0 ;i< n ; i++){
                int k=sc.nextInt();
                sum+=k;
                if(k%2==0){
                    int count=0;
                    while(k%2!=1){
                        k/=2;
                        count++;
                    }
                    out=Math.min(out,count);
                }
                else{
                    int count=0;
                    while(k%2!=0){
                        k/=2;
                        count++;
                    }
                    out=Math.min(out,count);
                }
            }
            if(sum%2==0) System.out.println(0);
            else System.out.println(out);
        }
    }
}
