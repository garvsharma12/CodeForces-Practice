import java.util.Scanner;

public class SumOf2050{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0){
            long n = sc.nextLong();
            if(n%2050!=0) System.out.println(-1);

            else{
                int len = (int)Math.floor(Math.log10(n)+1);
                len-=3;
                int count=0;
                long d = 0;
                //System.out.println(d);
                while(n!=0){
                    d=(long)(205*Math.pow(10,len));
                    //System.out.println(d);
                    if(d<=n){
                        n-=d;
                        count++;
                    }
                    else {
                        len-=1;
                    }
                }
                System.out.println(count);
            }
   }
        }
    }
}