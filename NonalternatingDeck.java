import java.util.Scanner;

public class NonalternatingDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println(1+" "+0);
        else{
            int alice=1 , bob=1 , cnt=1;
            n-=1 ;
            while(n!=0){
                if(cnt+4<=n){
                    bob+=4;
                    n-=1;
                }
            }
        }
    }
}
