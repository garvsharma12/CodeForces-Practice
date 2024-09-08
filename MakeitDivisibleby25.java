
import java.util.Scanner;

public class MakeitDivisibleby25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String num = sc.nextLine();
            int n = num.length();
            System.out.println(go(num,n));
        }
    }
    static int go(String str , int n){
        if(n==1){
            return 0;
        }
        if(str.charAt(n-1)=='0' && str.charAt(n-2)=='0') return 0;
        else if(str.charAt(n-1)=='0' && str.charAt(n-2)=='5') return 0;
        else if(str.charAt(n-1)=='5' && str.charAt(n-2)=='7') return 0;
        int srt=-1 , end=-1 , ext=0;
        boolean a = true ;
        for(int i=n-1 ; i>=0 ; i--){
            if(a && str.charAt(i)=='5'){
                ext=n-1-i;
                srt=i; 
                a=false;
            }
            else if(!a && str.charAt(i)=='7'){
                end=i;
                break;
            }
        }
        int res = Integer.MAX_VALUE;
        a=true;
        if(srt!=-1 && end!=-1)
            res = srt-end-1+ext;
        ext=0;
        srt=-1 ; end=-1;
        for(int i=n-1 ; i>=0 ; i--){
            if(a && str.charAt(i)=='0'){
                ext=n-1-i;
                srt=i; 
                a=false;
            }
            else if(!a && str.charAt(i)=='5'){
                end=i;
                break;
            }
        }
        if(srt!=-1 && end!=-1) res= Math.min(res,srt-end-1+ext);
        a=true;
        ext=0;
        srt=-1 ; end=-1;
        for(int i=n-1 ; i>=0 ; i--){
            if(a && str.charAt(i)=='0'){
                ext=n-1-i;
                srt=i; 
                a=false;
            }
            else if(!a && str.charAt(i)=='0'){
                end=i;
                break;
            }
        }
        if(srt!=-1 && end!=-1) res= Math.min(res,srt-end-1+ext);

        a=true;
        ext=0;
        srt=-1 ; end=-1;
        for(int i=n-1 ; i>=0 ; i--){
            if(a && str.charAt(i)=='5'){
                ext=n-1-i;
                srt=i; 
                a=false;
            }
            else if(!a && str.charAt(i)=='2'){
                end=i;
                break;
            }
        }
        if(srt!=-1 && end!=-1) res= Math.min(res,srt-end-1+ext);
        return res;
    }
}
