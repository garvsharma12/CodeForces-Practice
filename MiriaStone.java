import java.util.Arrays;
import java.util.Scanner;

public class MiriaStone {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long[] arr1 = new long[n];
            long[] pre_s1 = new long[n];
            for(int i=0 ;i<n ;i++)
            {
                arr1[i]=sc.nextLong();
                if(i==0) pre_s1[i]=arr1[i];
                else pre_s1[i]=pre_s1[i-1]+arr1[i];
            }
            long pre_s2[] = new long[n];
            Arrays.sort(arr1);
            pre_s2[0]=arr1[0];
            for(int i=1 ;i<n ;i++)
                pre_s2[i]=pre_s2[i-1]+arr1[i];

            int k = sc.nextInt();
            while(k-->0)
            {
                int t = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();

                if(t==1)
                {
                    if(l==1) System.out.println(pre_s1[r-1]);
                    else {long out = (pre_s1[r-1]-pre_s1[l-2]);
                        System.out.println(out);
                    }
                }
                else{
                    if(l==1) System.out.println(pre_s2[r-1]);
                    else{ long out = (pre_s2[r-1]-pre_s2[l-2]);
                        System.out.println(out);
                    }
                }
            }
        }
    }
}
