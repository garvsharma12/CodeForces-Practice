import java.util.Scanner;

public class FindKDistinctPointswithFixedCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt();
            long req1 = x * k, req2 = y * k;
            int val1 = (req1 < 0) ? 1 : -1, val2 = (req2 < 0) ? 1 : -1;

            if (k == 1) val1 = val2 = 0;

            for (int i = 0; i < k - 1; i++) {
                System.out.print((req1 >= 0 ? val1-- : val1++) + " ");
                System.out.println(req2 >= 0 ? val2-- : val2++);
            }

            int temp = Math.abs(val1) - 1;
            long sum1 = temp * (temp + 1L) / 2;
            if (val1 < 0) sum1 = -sum1;
            long out1 = req1 - sum1;

            temp = Math.abs(val2) - 1;
            long sum2 = temp * (temp + 1L) / 2;
            if (val2 < 0) sum2 = -sum2;
            long out2 = req2 - sum2;

            System.out.println(out1 + " " + out2);
        }
        sc.close();
    }
}
