import java.util.*;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            long cmin=0,cmax=0;
            if(n%2!=0 || n<4){
                System.out.println(-1); continue;
            }
            else if(n==4){
                System.out.println(1+" "+1);
            }
            else if(n==6){
                System.out.println(1+" "+1);
            }
            else if(n%4==0 && n%6==0){
                cmin=n/6 ; cmax=n/4;
                System.out.println(cmin+" "+cmax);
            }
            else{
                long temp=n;
                int cmn=0;
                while(temp%4!=0){
                    temp-=6; cmn++;
                }
                cmax=temp/4+cmn;

                int cmx=0;
                while(n%6!=0){
                    n-=4; cmx++;
                }
                cmin=n/6+cmx;
                System.out.println(cmin+" "+cmax);
            }
        }
    }
}
