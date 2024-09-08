
import java.util.Scanner;
public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long max=0;
            long min=0;
            for(int i=0 ; i<n ;i++){
                int num = sc.nextInt();
                min+=num;
                max+=(long)Math.ceil((double)num/(double)x);
            }
            min=(long)Math.ceil((double)min/(double)x);
            System.out.println(min+" "+max);
        }
    }
}
