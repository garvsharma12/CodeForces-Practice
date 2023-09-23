import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class DistinctSplit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                ArrayList<Integer> pre = new ArrayList<>();
                int[] suf = new int[n];
                HashSet<Character> set = new HashSet<>();
                HashSet<Character> set2 = new HashSet<>();
                int out =0;
                for(int i=0 , j=n-1;i<n && j>=0 ; i++ , j--){
                    set.add(s.charAt(i));
                    pre.add(set.size());
                    set2.add(s.charAt(j));
                    suf[j]=(set2.size());
                }
                for(int i=0 ; i<n-1 ; i++){
                    out = Math.max(pre.get(i)+suf[i+1],out);
                }
                System.out.println(out);

            }
        }
    }
}
