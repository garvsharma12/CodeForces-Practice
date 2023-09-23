import java.util.Scanner;

public class Fence{
    public static void main(String[] args){
        int i=0,j=0,min=0,mini=0,s=0;
        int[] a = new int[150010];
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(i=1;i<=n;i++) a[i]=sc.nextInt();
            min=0;
            for(j=1;j<=k;j++)min+=a[j];
            mini=1;s=min;
            for(i=2;i<=n-k+1;i++){
                s=s-a[i-1]+a[i+k-1];
                if(s<min){min=s;mini=i;}
            }
        }
        System.out.println(mini);
    }
}