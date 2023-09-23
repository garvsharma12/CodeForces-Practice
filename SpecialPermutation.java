import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n%2==0){
                n++;
                while(n-->1){
                    System.out.print(n+" ");
                }System.out.println();
            }
            else{
                int mid = (int)Math.ceil((double)(n)/2);
                for(int i=n ; i>0 ; i--){
                    if(i==mid){
                        System.out.print(mid-1+" "+mid+" ");
                        i--;
                    }
                    else System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
