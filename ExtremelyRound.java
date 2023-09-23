import java.util.Scanner;

public class ExtremelyRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n<=9) System.out.println(n);
            else{
                int count=9,num=10;
                while(num<=n){
                    count++;
                    int len = (int)(Math.log10(num)+1);
                    long po = (long)Math.pow(10, len-1);
                    num+=po;
                    //count++;
                }
                System.out.println(count);
            }
        }
    }
}