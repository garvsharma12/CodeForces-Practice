import java.util.Scanner;

public class MagicStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>3) System.out.println("Yes");
            else if(x==1){
                if(y==1) System.out.println("Yes");
                else System.out.println("NO");
            }
            else{
                if(y<=3) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
