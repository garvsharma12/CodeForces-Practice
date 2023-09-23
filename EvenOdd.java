import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        boolean b = true;
        if(n%2==0)
            b=true;
        else 
            b=false;
        long odd=0 , even=0;
        if(b)
        {
            even=odd=n/2;
        }
        else 
        {
            odd=n/2+1;
            even=n/2;
        }

        if(k<=odd)
            System.out.println((k*2)-1);
        else 
            System.out.println(2*(k-odd));


        sc.close();
    }
}
