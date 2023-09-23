import java.util.HashSet;
import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long range=sc.nextLong();
            int count=1;
            int n = 2;
            long num=0;
            boolean sqr=true , cube = true;
            HashSet<Long> hs = new HashSet<>();
            while(sqr || cube){
                if(sqr){
                    num= (long)(Math.pow(n,2));
                    if(num<=range){ hs.add(num);}
                    else sqr=false;
                }
                if(cube){
                    num = (long)(Math.pow(n,3));
                    if(num<=range) { hs.add(num);}
                    else cube=false;
                }
                n++;
            }
            System.out.println(hs.size()+1);
        }
    }
}
