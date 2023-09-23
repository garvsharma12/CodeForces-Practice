import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        if(len==1) System.out.println(0);
        else{
            long sum = 0 , count =0;
            while(len!=1){
                sum=0;
                for(int i=0 ;i<len ; i++){
                    sum+=Character.getNumericValue(s.charAt(i));
                }
               // System.out.println(sum);
                count++;
                s=Long.toString(sum);
                len=s.length();
            }
            System.out.println(count);
        }
    }
}
