import java.util.Scanner;

public class EveryoneLovesToSleep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
            int ansHr=60 , ansMin=60;
            int result=1_000_000;
            int time = H*60 + M;
            int nT;
            while (n-->0){
                int h = sc.nextInt();
                int m = sc.nextInt();
                nT = h*60 + m;
			
                if (nT < time) {
                    result = Math.min(result, nT + 24*60 - time);
                }else {
                    result = Math.min(result, nT - time);
                }   
            }
            System.out.println(result/60+" "+result%60);
        }
    }
}