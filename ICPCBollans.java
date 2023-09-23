import java.util.Scanner;

public class ICPCBollans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int[] chk = new int[27];
            int out=0;
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for(int i=0 ;i<n ; i++){
                if(chk[s.charAt(i)-65]==0){
                    out+=2; chk[s.charAt(i)-65]++;
                }
                else{
                    out++;
                }
            }
            System.out.println(out);
        }
    }
}
