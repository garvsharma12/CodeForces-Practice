import java.util.Scanner;

public class SoftDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int temp1 = (k*l/nl)/n;
        int temp2 = (c*d)/n;
        int temp3 = (p/(np)/n);
        int mn = Math.min(temp1,temp2);
        if(mn<=temp3)
            System.out.println(mn);
        else 
            System.out.println(temp3);

        sc.close();
    }
}
