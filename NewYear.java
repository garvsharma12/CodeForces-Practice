import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            long n = sc.nextInt();
            if(n<2020) System.out.println("NO");
            else if(n%2020==0 || n%2021==0) System.out.println("YES");
            else{
                long rem=n%2020;
                long out = n-2021*rem;
                if(out%2020==0 && out>=2020) System.out.println("YES");
                else System.out.println("NO");
                //System.out.println(out);
            }
        }
    }
}
