import java.util.Scanner;

public class IlyandQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = sc.nextInt();
        while(m-->0){
            int l= sc.nextInt();
            int r =sc.nextInt();
            // String temp = s.substring(l-1,r);
            // int len = temp.length();
            int cnt=0;
            for(int i=l-1 ;i<r-1 ;i++){
                if(s.charAt(i)==s.charAt(i+1)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
