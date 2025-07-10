//ॐ नमो नारायणाय ॐ नमो भगवते वासुदेवाय:

import java.io.*;
import java.util.*;

public class Looser1202 {
    final static int mod = 1000000007;

    static long gcd(long a, long b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    static boolean reverse(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    static boolean allSame(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        return hs.size() == 1;
    }

    static int XOR(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    public static long leftMostBitNumber(long n) {
        if (n == 0) return 0;
        long k = Long.numberOfLeadingZeros(n);
        long val = 1 << (31 - k);
        return val;
    }

    // private static int pref2D(int[][] arr, int x1, int y1, int x2, int y2) {
    //     int[][] prefix = new int[arr.length][arr[0].length];
    //     for(int i=0 ;i<arr.length ; i++){
    //         for(int j=0 ; j<arr[0].length ; j++){
    //             prefix[i][j]=arr[i][j];
    //             if(j>0){
    //                 prefix[i][j]+=prefix[i][j-1];
    //             }
    //             if(i>0){
    //                 prefix[i][j]+=prefix[i-1][j];
    //             }
    //             if(i>0 && j>0){
    //                 prefix[i][j]-=prefix[i-1][j-1];
    //             }
    //         }
    //     }
    //     // int query=5;
    //     // int ans=prefix[x2][y2];
    //     // while(query-->0){
    //     //     if(x1>0)
    //     //         ans+=prefix[x1-1][y2];
    //     //     if(y1>0) 
    //     //         ans+=prefix[x2][y1-1];
    //     //     if(x1>0 && y1>0) 
    //     //         ans+=prefix[x1-1][y1-1];
    //     // }
    //     // return ans;
    // }
    // static int[] dx = {1, 1, -1, -1};
    // static int[] dy = {1, -1, 1, -1};
    private static void solve() {
        int a = nextInt(), b = nextInt(), c = nextInt();
        if ((2*b - c) >0 && (2*b - c)%a==0 ||
        (a+c)%2==0 && ((a+c)/2)%b==0 && ((a+c)/2)/b >=1 ||
        (2*b - a)>0 && (2*b - a)%c==0)
            out.println("YES");
        else
            out.println("NO");

        if ((2*b - c > 0 && (2*b - c) % a == 0) ||
        ((a+c)%2 == 0 && (a+c)/2 > 0) ||
        (2*b - a > 0 && (2*b - a)%c == 0))
            out.println("YES");
        else
            out.println("NO");
    }
    
    private static void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int tt = nextInt();
            //int tt = 1;
            for (int i = 1; i <= tt; i++)
                solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static StringTokenizer st;
    private static BufferedReader br;
    private static PrintWriter out;

    private static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    private static int nextInt() {
        return Integer.parseInt(next());
    }

    private static long nextLong() {
        return Long.parseLong(next());
    }

    public static void main(String[] args) {
        run();
    }
}
