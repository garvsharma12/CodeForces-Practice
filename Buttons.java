import java.util.*;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+c>b+c){
                System.out.println("First");
            }
            else if(b+c>a+c){
                System.out.println("Second");
            }
            else{
                if(c%2==0) System.out.println("Second");
                else System.out.println("First");
            }
        }
    }
}
