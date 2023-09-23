import java.util.Scanner;
public class BuyTheString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt = sc.nextInt();
            while(tt-->0){
            int n = sc.nextInt();
            int c0 = sc.nextInt();
            int c1 = sc.nextInt();
            int h = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count0=0 , count1=0;
            for(int i=0 ; i<s.length() ; i++){
                if(s.charAt(i)=='0') count0++;
                else count1++;
            }
            long outIn=count0*c0+count1*c1;
            long out0=count1*h+(n*c0);
            long out1=count0*h+(n*c1);
            long out = Math.min(outIn,out0);
            out = Math.min(out,out1);
            //System.out.println(outIn+" "+out0+" "+out1);
            System.out.println(out);
            }
        }
    }
}
