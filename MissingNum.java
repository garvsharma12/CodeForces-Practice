import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long temp=num;
        long sum=0;
        while(temp-->1)
        {
            long n = sc.nextLong();
            sum+=n;
        }
        long cal = ((num*(num+1))/2);
        System.out.println(cal-sum);

        sc.close();
    }
}
