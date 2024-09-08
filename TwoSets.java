import java.util.*;
public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum=(n*(n+1));
        long half = sum/4;
        int srt=1 , end=n;
        if(sum%4!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            System.out.println(n/2);
            int cnt=0;
            while(half!=0){
                if(half-end==0){
                    cnt++;
                    System.out.print(end+" ");
                    half-=end;
                    end--;
                    break;
                }
                else{
                    cnt++;
                    System.out.print(end+" ");
                    half-=end;
                    end--;
                }
                if(half-srt==0){
                    cnt++;
                    System.out.print(srt+" ");
                    half-=srt;
                    srt++;
                    break;
                }
                else{
                    cnt++;
                    System.out.print(srt+" ");
                    half-=srt;
                    srt++;
                }
            }
            System.out.println();
            System.out.println(n-(n/2));
            for(; srt<=end ; srt++){
                System.out.print(srt+" ");
            }
            System.out.println();
        }
    }
}
