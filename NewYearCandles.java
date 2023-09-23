import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b) System.out.println(a);
        else if(b==a) System.out.println(a+1);
        else{
            int out=0,temp=0;
            while(a>0){
                out++;
                temp++;
                a-=1;
                if(temp==b){
                    a++;
                    temp=0;
                }
            }
            System.out.println(out);
        }
    }
}
