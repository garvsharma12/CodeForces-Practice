import java.util.*;
public class FindAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            char [] arr = sc.next().toCharArray();
            if(n==1){
                System.out.println("YES");
                continue;
            }
            int[] vals = new int[26];
            Arrays.fill(vals,-1);
            vals[arr[0] - 'a'] = 0;
            boolean b=true;
            int v;
            for (int i = 1; i < arr.length; ++i) {
                v = arr[i] - 'a';
                if (vals[v] == -1) {
                    vals[v] = i % 2;
                } 
                else if (vals[v] != (i % 2) ){
                    System.out.println("NO");
                    b=false;
                    break;
                }
            }
            if(b) System.out.println("YES");
        }
    }
}
