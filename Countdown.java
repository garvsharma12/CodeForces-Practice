import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-->0) {
                int n =sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                long count=0;
                for(int i=n-1 ; i>=0 ;i--)
                {
                    int num = Character.getNumericValue(s.charAt(i));
                    if(i==n-1 && num!=0) count+=num;
                    else if(num!=0)
                    {
                        count+=num;
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
