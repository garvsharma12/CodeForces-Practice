import java.util.Scanner;

public class TaisiandDice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int s = sc.nextInt();
                int r = sc.nextInt();
                String out = Integer.toString(s-r);
                n--;
                int range = s-r , sum=r;
                while(n>0)
                {
                    if(sum-range>=n-1)
                    {
                        out+=" ";
                        out+=Integer.toString(range);
                        n--;
                        sum-=range;
                    }
                    else --range;
                }
                System.out.println(out);
            }
        }
    }
}
