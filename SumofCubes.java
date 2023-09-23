import java.util.Scanner;

public class SumofCubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long num = sc.nextLong();
            long n = 1 , k=0 , pt2=0 , cr=0 , chk=0 ;

            while(true){
                k=(long)(Math.pow(n,3));
                if(k>=num){
                    System.out.println("No");
                    break;
                }
                pt2=num-k;
                cr=(long)(Math.cbrt(pt2));
                chk = (long)Math.pow(cr,3);
                if(chk==pt2){
                    System.out.println("Yes");
                    break;
                }
                n++;
            }
        }
    }
}