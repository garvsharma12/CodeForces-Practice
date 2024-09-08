import java.util.*;
public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String  s = sc.nextLine();
            int idx=1,ans=0;

            for(int i=0 ;i<s.length();i++){
                char c = s.charAt(i);
                    if(c=='0'){
                        ans+=(Math.abs(idx-10)+1);
                        idx=10;
                    }
                    else{
                        ans+=(Math.abs(idx-Character.getNumericValue(c))+1);
                        idx=Character.getNumericValue(c);
                    }
            }
            System.out.println(ans);
        }
    }
}
