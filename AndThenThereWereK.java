import java.util.Scanner;

public class AndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int res = Integer.highestOneBit(n)-1;
            System.out.println(res);
        }
    }
}
