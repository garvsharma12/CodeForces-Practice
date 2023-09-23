import java.util.Scanner;

public class RoundSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            String out="";
            int temp=0 , k=0;
            String s = Integer.toString(n);
            int len = s.length(), count=len-1;
            for(int i=0 ;i<len;i++){
                if(s.charAt(i)=='0') count--;
                else if(s.charAt(i)!='0'){
                    temp=Character.getNumericValue(s.charAt(i))*(int)Math.pow(10,count);
                    out+=""+temp+" "; count--; k++;
                }
            }
            System.out.println(k);
            System.out.println(out);
        }
    }
}
