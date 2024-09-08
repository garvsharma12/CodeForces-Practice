import java.util.*;

public class ServalandMochaArray {
    public static boolean isPrime(int n)
    {
        // Corner case
        if (n == 1)
            return true;
         // For n=2 or n=3 it will check
        if (n == 2 || n == 3)
            return true;
        // For multiple of 2 or 3 This will check 
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        // It will check all the others condition
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    public static int gcd(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean b=false;
            for(int i=0 ;i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1) b=true;
            }
            boolean check=true;
            if(b) System.out.println("yes");
            else{
                //Arrays.sort(arr);
                for(int i=0 ; i<n ;i++){
                    for(int j=0;j<n;j++){
                        if(i!=j && gcd(arr[i], arr[j])<=2){
                            System.out.println("yes");
                            check=false;
                            break;
                        }
                    }
                    if(!check) break;
                }
                if(check) System.out.println("no");
            }

        }
    }
}
