import java.util.Scanner;

public class TypicalInterview {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0)
            {
                int k = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                String sb="";
                int sz=1;
                while(sz<=100){
                    if(sz%3==0) sb+="F";
                    if(sz%5==0) sb+="B";
                    sz++;
                }
                if(sb.indexOf(s)!=-1) System.out.println("YES");
                else System.out.println("NO");
            }
                
        }
    }
}
