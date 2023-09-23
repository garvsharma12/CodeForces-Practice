import java.util.*;

public class YetAnotherBookshelf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0 ;i<n; i++) arr[i]=sc.nextInt();

                int cL=-1 , cR=-1;
                boolean bL=true , bR=true;
                for(int i=0 , j=n-1 ; i<=j ;){
                    if(arr[i]==1){
                        if(bL){
                            cL=i; bL=false;
                        }
                    }
                    if(arr[j]==1){
                        if(bR){
                            cR=j; bR=false;
                        }
                    }
                    if(bL) i++;
                    if(bR) j--;
                    if(!bL && !bR) break;
                }
                //System.out.println(cL+" "+cR);

                int cnt1=0,cnt2=0;

                    for(int i=cL ; i<cR;i++){
                        if(arr[i]==0) cnt1++;
                    }
                    for(int i=cR ; i>cL;i--){
                        if(arr[i]==0) cnt2++;
                    }
                System.out.println(Math.min(cnt1,cnt2));

            }
        }
    }
}
