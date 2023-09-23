import java.util.Scanner;

public class NewPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            while(n-->0){
                String s = sc.nextLine();
                int temp=0;
                int[] count = new int[27];
                for(int i=0 ;i<s.length() ; i++){
                    count[s.charAt(i)-97]++;
                }
                for(int i=0 ;i<27 ; i++){
                    if(count[i]>=2) temp++;
                }
                if(temp>1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
