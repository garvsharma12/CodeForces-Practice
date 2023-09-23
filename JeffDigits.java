import java.util.Scanner;

public class JeffDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count_5=0 , count_0=0;
        for(int i=0 ; i<n ; i++)
        {
            int num = sc.nextInt();
            if(num==5)
                count_5++;
            else 
                count_0++;
        }
        
        if((count_5<9)&&(count_0>0))
            System.out.println(0);
        else if(count_0==0)
            System.out.println(-1);
        else if((count_5%9==0))
        {
            String res="";
            res="5".repeat(count_5);
            res+="0".repeat(count_0);
            System.out.println(res);
        }
        else 
        {
            String res="";
            res="5".repeat((count_5/9)*9);
            res+="0".repeat(count_0);
            System.out.println(res);
        }
        sc.close();
    }
}