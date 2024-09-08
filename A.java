import java.util.*;

public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        //sc.nextLine();
        while(tt-->0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            if(l==r) System.out.println(1);
            else if(r-l==1) System.out.println(2);
            else{
                int max = 0;
                long Sum = l;
            while (true) {
                if ((Sum + (max + 1)) <= r) {
                    Sum += (max+1);
                    max++;
                } else {
                    break;
                }
            }
            System.out.println(max+1);
            }
        }
    }
}