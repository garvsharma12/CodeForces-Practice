import java.util.Scanner;
public class ToyPairs{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long k = sc.nextLong();
       long out=0;
       if(n==k && n<=2) System.out.println(0);
       else if(n==k) {
          out=(long)Math.floor((double)(n-1)/2);
          System.out.println(out);
       }
       else if(n+n-1<k) System.out.println(0);
       else if(n>k){
          out=(long)Math.ceil((double)k/2);
          System.out.println(out-1);
       }
       else{
          out=(long)Math.ceil((2*(double)n-(double)k)/2);
          System.out.println(out);
       }
     }
}