import java.util.*;
import java.lang.*;
import java.io.*;
public class AdvantageII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt= sc.nextInt();
        while(tt-->0){
            int n =sc.nextInt();
            List<Integer> a1 = new ArrayList<>();
            List<Integer> a2 = new ArrayList<>();
            int mx1=0 , mxcount=0;
            for(int i=0 ;i<n ; i++){
                int k = sc.nextInt();
                a1.add(k); a2.add(k);
                mx1=Math.max(mx1,k);
            }
            Collections.sort(a2);
            int  mx2=0;
            for(int i=n-1 ; i>=0 ; i--){
                if(a2.get(i)==mx1){ mxcount++; continue;}
                else{
                    mx2=a2.get(i);
                    break;
                }
            }
            if(mx2==0){
                for(int i=0 ; i<n ; i++){
                    System.out.print(0+" ");
                }
                System.out.println(); continue;
            }
            for(int i=0 ; i<n ; i++){
                if(a1.get(i)==mx1 && mxcount>1){
                    System.out.print(0+" ");
                }
                else if(a1.get(i)==mx1 && mxcount<2) System.out.print(mx1-mx2+" ");
                else{
                    System.out.print(a1.get(i)-mx1+" ");
                }
            }
            System.out.println();
        }
    }
}