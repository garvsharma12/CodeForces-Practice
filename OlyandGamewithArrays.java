import java.util.*;

public class OlyandGamewithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int idx=0;
            int pointer=-1, val=Integer.MAX_VALUE;
            int copy = n;
            while(n-->0){
                int m = sc.nextInt();
                int mn = Integer.MAX_VALUE , mnII = Integer.MAX_VALUE;
                while(m-->0){
                    int a = sc.nextInt();
                    if(a<=mn){
                        mnII=mn;
                        mn=a;
                    }
                    else{
                        mnII=Math.min(mnII,a);
                    }
                }
                if(mnII<val){
                    pointer= idx;
                    val=mnII;
                }
                arr1[idx]=mn ; arr2[idx++]=mnII;
            }
            long res = 0;
            long small=Long.MAX_VALUE;

            for(int j=0 ; j<copy ;j++){
                //System.out.println(j+" "+"j");
                if(j==pointer){
                    small=Math.min(small,arr1[j]);
                }
                else{
                    res+=arr2[j]; 
                    small=Math.min(small,arr1[j]);
                }
            }
            res+=small;
            System.out.println(res);
        }
    }    
}
