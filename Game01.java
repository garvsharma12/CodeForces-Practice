import java.util.Scanner;

public class Game01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt =sc.nextInt();
            sc.nextLine();
            while(tt-->0){
                //int n = sc.nextInt();
                //sc.nextLine();
                String s = sc.nextLine();
                int c0 =0 , c1=0;
                for(int i=0 ;i<s.length() ; i++){
                    if(s.charAt(i)=='0') c0++;
                    else c1++;
                }
                if(c1==0 || c0==0) System.out.println("NET");
                else{
                    //System.out.println(c0+" "+c1);
                    int req = Math.min(c0,c1)%2;
                    if(req==0) System.out.println("NET");
                    else System.out.println("DA");
                }
            }
        }
    }
}
