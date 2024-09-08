import java.util.Scanner;

public class MaximizeTheLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int res=-1;
            for(int i=1 ; i<=n ;i++){
                int x = sc.nextInt();
                if(i%2==1)
                    res=Math.max(x,res);
            }
            System.out.println(res);
        }
    }
}
