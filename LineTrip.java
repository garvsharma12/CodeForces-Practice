import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int x=sc.nextInt();
            int mx=0,lastC=0;
            for(int i=1 ; i<=n ;i++){
                int num = sc.nextInt();
                if(i==1){
                    lastC=num;
                    mx=Math.max(num-0,mx);
                }
                else{
                    mx=Math.max(mx,num-lastC);
                    lastC=num;
                }
            }
            mx=Math.max(mx,2*(x-lastC));
            System.out.println(mx);
        }
    }
}
