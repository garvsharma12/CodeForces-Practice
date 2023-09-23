import java.util.HashSet;
import java.util.Scanner;

public class MusicalPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            //int count=0;
            String sub2="";
            HashSet<String> h = new HashSet<>();
            for(int i=0 ;i<n-1 ; i++){
                sub2 = s.substring(i,i+2);
                h.add(sub2);
            }
            System.out.println(h.size());
        }
    }
}
