import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=5) System.out.println(1);
        else if(n%5==0){
            System.out.println(n/5);
        }
        else{
            int out = n/5;
            out+=1;
            System.out.println(out);
        }
    }
}
