import java.util.Scanner;

public class InfinityTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                long n = sc.nextLong();
                long sqrt = (long) Math.ceil(Math.sqrt(n));
                long sq = (long)Math.pow(sqrt, 2);
                long diff = sq-n;
                if(diff<sqrt){
                    long row = sqrt;
                    long colm = diff+1;
                    System.out.println(row+" "+colm);
                }
                else{
                    long row = 2*sqrt-diff-1;
                    long colm = sqrt;
                    System.out.println(row+" "+colm);
                }
            }
        }
    }
}
