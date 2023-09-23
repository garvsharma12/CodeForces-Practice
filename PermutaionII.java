import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PermutaionII{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int t = sc.nextInt();
            HashSet<Integer> hh = new HashSet<>(); 
           int k = t*(t-1);
           while(k-->0){
            int j = sc.nextInt();
            hh.add(j);
           }
            Iterator<Integer> it = hh.iterator();
            while (it.hasNext()) {
  
                // Print HashSet values
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }
}