import java.util.Scanner;

public class JzzhuandSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long n = sc.nextLong();
        long z1 = y1-x1;
        long x2= -x1;
        long y2 = -y1;
        long z2 = -z1;
        long output=0;
        if(n%6==1)
        {
            output=x1%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        else if(n%6==2)
        {
            output=y1%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        else if(n%6==3)
        { 
            output=z1%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        else if(n%6==4)
        {
            output=x2%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        else if(n%6==5)
        {
            output=y2%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        else 
        {
            output=z2%1000000007;
            if(output<0)
                output=1000000007+output;
        }
        System.out.println(output);
        sc.close();
    }
}
