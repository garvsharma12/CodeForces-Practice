import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int k=0;
            if(Character.getNumericValue(s.charAt(0))<d){
                String out = Integer.toString(d)+s;
                System.out.println(out);
                continue;
            }
            ArrayList<Character> chars = new ArrayList<>();
                for(int i=0 ;i<n ;i++){
                    chars.add(s.charAt(i));
                }
            boolean b = true;
            for(int i=0 ;i<n ; i++){
                k=Character.getNumericValue(s.charAt(i));
                if(k<d){
                    chars.add(i,(char)(Character.forDigit(d,10))); b = false;
                    StringBuilder builder = new StringBuilder();
                    for(Character ch: chars) builder.append(ch);
                    System.out.println(builder);
                    break;
                }
            }
            if(b){
                s+=""+d;
                System.out.println(s);
                continue;
            }
        }
    }
}