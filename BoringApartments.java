import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            //sc.nextLine();
            while(t-->0)
            {
                int n = sc.nextInt();
                long T  = 10*(n%10);
                //System.out.println(T);
                String s = Integer.toString(n);
                if(s.length()==4) System.out.println(T);
                else if(s.length()==3) System.out.println(T-4);
                else if(s.length()==2) System.out.println(T-7);
                else if(s.length()==1) System.out.println(T-9);
            }
        }
    }
}
