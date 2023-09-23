import java.util.Arrays;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0 ;i<3 ; i++) a[i]=sc.nextInt();
        //Arrays.sort(a);
        int[] out = new int[6];
        out[0]=a[0]*a[1]*a[2];
        out[1]=a[0]+a[1]+a[2];
        out[2]=(a[0]*a[1])+a[2];
        out[3]=a[0]*(a[1]+a[2]);
        out[4]=(a[0]+a[1])*a[2];
        out[5]=a[0]+(a[1]*a[2]);
        int k = Arrays.stream(out).max().getAsInt();
        System.out.println(k);
        //System.out.println(output);
    }
}
