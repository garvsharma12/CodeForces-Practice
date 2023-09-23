import java.util.Scanner;

public class DominoDisaster {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                String out ="";
                for(int i=0 ;i<n ;i++){
                    if(s.charAt(i)=='U') out+='D';
                    else if(s.charAt(i)=='D') out+='U';
                    else if(s.charAt(i)=='L') out+='L';
                    else out+='R';
                }
                System.out.println(out);
            }
        }
    }
}
