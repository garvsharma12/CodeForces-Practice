import java.util.Scanner;

public class Rigged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int req1 = 0 , req2=0 , s=0 , e=0 , out =0;
            for(int i=0 ;i<n ;i++){
                s =sc.nextInt();
                e = sc.nextInt();
                if(i==0){
                    req1=s;
                    req2=e;
                    out = req1;
                }
                else{
                    if(s>=req1 && e>=req2) out=-1;
                }
            }
            System.out.println(out);
        }
    }
}
