import java.util.*;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int P=0,N=0;
            while(n-->0){
                int num = sc.nextInt();
                if(num==-1) N++;
                else P++;
            }
            int ans=0;
            while(N>=0 && P>=0){
                if(N%2==0 && P>=N){
                    break;
                }
                N--; P++; ans++;
            }
            System.out.println(ans);
        }
    }
}
