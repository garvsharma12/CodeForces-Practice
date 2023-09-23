import java.util.ArrayList;
import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t =sc.nextInt();
            while(t-->0){
                ArrayList<Integer> odd = new ArrayList<>();
                ArrayList<Integer> even = new ArrayList<>();
                int n = sc.nextInt();
                while(n-->0){
                    int k = sc.nextInt();
                    if(k%2==1) odd.add(k);
                    else even.add(k);
                }
                for(int i=0 ;i<odd.size() ;i++) System.out.print(odd.get(i)+" ");
                for(int i=0 ;i<even.size() ;i++) System.out.print(even.get(i)+" ");
                System.out.println();
            }
        }
    }
}
