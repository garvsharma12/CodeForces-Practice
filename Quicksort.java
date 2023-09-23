import java.util.Scanner;

public class Quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt= sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a=1 , count=0 , temp=0;
            for(int i=1 ;i<=n ;i++){
                temp=sc.nextInt();
                if(temp==a){
                    a++;
                }
            }
            System.out.println((n-a+k)/(k));
        }
    }
}
