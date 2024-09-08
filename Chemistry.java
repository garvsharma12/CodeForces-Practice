import java.util.*;
public class Chemistry{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[] freq = new int[26];
            for(int i=0 ;i<n ; i++){
                freq[s.charAt(i)-'a']++;
            }
            int odd =0;
            for(int x:freq){
                if(x%2==1) odd++;
            }
            if((odd)<=(k+1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
