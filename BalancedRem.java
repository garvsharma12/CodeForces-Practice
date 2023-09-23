import java.util.Scanner;

public class BalancedRem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int c0=0 , c1=0 , c2=0;
            for(int i=0 ; i<n ; i++){
                 arr[i]=sc.nextInt();
                 if(arr[i]%3==0) c0++;
                 else if(arr[i]%3==1) c1++;
                 else c2++;
            }
            //System.out.println(c0+" "+c1+" "+c2);
            int req = (c0+c1+c2)/3;
        }
    }
}