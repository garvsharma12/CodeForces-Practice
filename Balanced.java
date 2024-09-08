import java.util.*;
public class Balanced{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int c1=0 , c2=0 , c3=0;
            for(int i=0 ; i<n ;i++ ){
                int x=sc.nextInt();
                if(x%3==0) c1++;
                else if(x%3==1) c2++;
                else c3++;
            }
            //System.out.println("c0 "+c0+" c1 "+c1+" c2 "+c2);
            int rem = n/3 , ans=0;
            while(true) {
                while(c1 > rem) {
                    c1--;
                    c2++;
                    ans++;
                }
                while(c2 > rem) {
                    c2--;
                    c3++;
                    ans++;
                }
                while(c3 > rem) {
                    c3--;
                    c1++;
                    ans++;
                }
                if(c1 == rem && c2 == rem && c3 == rem) {
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}