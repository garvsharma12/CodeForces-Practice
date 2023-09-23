import java.util.Scanner;

public class EquidistantLetters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            while(t-->0)
            {
                String s = sc.nextLine();
                int n = s.length();
                int[] count = new int[27];
                for(int i=0 ; i<n ;i++)
                    count[s.charAt(i)-97]++;
                //System.out.println(Arrays.toString(count));
                String out1="" , out2="";
                String k ="";
                for(int i=0 ;i<27 ;i++)
                {
                    k="";
                    if(count[i]==2){
                        k=""+((char)(i+97));
                        out1+=k.repeat(2);
                    }
                    else if(count[i]==1){
                        k=""+((char)(i+97));
                        out2+=k;
                    }
                }
                //System.out.println(out1);
                //System.out.println(out2);
                String o = out1+out2;
                System.out.println(o);
            }
        }
    }
}
