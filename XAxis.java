import java.util.Arrays;
import java.util.Scanner;

public class XAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int[] arr = new int[3];
            for(int i=0 ; i<3;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int req = arr[1] , out=0;
            for(int i=0 ; i<3 ;i++){
                out+=Math.abs(arr[i]-req);
            }
            System.out.println(out);
        }
    }
}
