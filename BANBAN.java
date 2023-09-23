import java.util.Scanner;

public class BANBAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            System.out.println(n/2+n%2);
            int i=1 , j=n*3;
            while(i<j){
                     System.out.println(i+" "+j);
                j-=3 ; i+=3;
            }
        }
    }
}
