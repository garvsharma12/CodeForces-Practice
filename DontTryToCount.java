import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            int cnt=0;
            boolean flag=false;
            while(a.length()<=25){
                if(a.contains(b)){
                    flag=true;
                    break;
                }
                a+=a;
                cnt++;
            }
            if(a.contains(b)){
                flag=true;
            }
            if(flag) System.out.println(cnt);
            else System.out.println(-1);
        }
    }
}
