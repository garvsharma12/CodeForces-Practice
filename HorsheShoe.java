import java.util.Scanner;

public class HorsheShoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        int count=0;
        if((a==b)||(a==c)||(a==d))
            count++;
        if((b==c)||(b==d))
            count++;
        if(c==d)
            count++;

        System.out.println(count);


        sc.close();

    }
}
