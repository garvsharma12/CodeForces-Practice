import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int copy=k;
            int res=0;
            while(k>0){
                if(k==copy){
                    k-=n;
                    n--;
                    res++;
                }
                if(k<=0) break;
                k-=n;
                res++;
                if(k<=0) break;
                k-=n;
                n--;
                res++;
                if(k<=0) break;
            }
            System.out.println(res); 
        }
    }
}
