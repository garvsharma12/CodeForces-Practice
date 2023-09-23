import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int result =-1;
            if(n%m==0){
                int d = n/m;
                result=0;
                while(d%2==0){
                    d/=2;
                    result++;
                }
                while(d%3==0){
                    d/=3;
                    result++;
                }
                if(d!=1) result=-1; 
            }
            System.out.println(result);
        }
    }
}
