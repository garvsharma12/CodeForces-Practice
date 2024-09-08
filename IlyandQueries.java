import java.util.Scanner;

public class IlyandQueries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] d = new int[n];
        
        d[0]=0;
        
        for (int i=0; i<n-1; i++) {
            if (i>0) d[i]=d[i-1];
            if (s.charAt(i)==s.charAt(i+1)) d[i]++;
        }
        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            if (l==0) System.out.println(d[r-1]);
            else System.out.println(d[r-1]-d[l-1]);
        }
    }
}