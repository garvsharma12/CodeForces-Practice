
import java.util.Scanner;
public class VladandShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            String ans="";
            int cnt1=0 , cnt2=0;
            boolean b1=true , b2=true;
            sc.nextLine();
            for(int j=0 ;j<n ;j++){
                String s= sc.nextLine();
                for(int i=0 ;i<n ; i++){
                    if(b1 && s.charAt(i)=='1') cnt1++;
                    else if(b2 && s.charAt(i)=='1') cnt2++;
                }
                if(cnt1!=0) b1=false;  
                if(cnt2!=0) b2 = false;
            }
            //System.out.println(cnt1+" "+cnt2);
            ans=Math.abs(cnt1-cnt2)>=1?"TRIANGLE":"SQUARE";
            System.out.println(ans);
        }
    }
}
