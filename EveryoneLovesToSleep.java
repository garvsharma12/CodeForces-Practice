import java.util.Scanner;

public class EveryoneLovesToSleep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();

            while(n-->0){
                int h = sc.nextInt();
                int m = sc.nextInt();
                int tempH=Integer.MAX_VALUE , tempM=Integer.MAX_VALUE;
                if(h==H && m==M){
                    System.out.println(0+" "+0);
                    break;
                }
                else if(h>H){
                    int temp1=h-H , temp2 = m-M;
                    if(tempH>temp1){
                        tempH=temp1 ; tempM=temp2;
                    }
                }

            }
        }
    }
}