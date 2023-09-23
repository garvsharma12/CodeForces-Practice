import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count=0;
        for(int i=0 ; i<n ; i++){
            int k = sc.nextInt();
            if(k<=h) count++;
            else count+=2;
        }
        System.out.println(count);
    }
}
