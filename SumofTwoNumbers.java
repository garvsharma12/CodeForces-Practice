import java.util.Scanner;
public class SumofTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            long n = sc.nextLong();
            if(n%10==9){
                String s = Long.toString(n);
                String s1 ="" , s2="";
                boolean flag=true;
                int t=0 , temp=0;
                for(int i=0 ;i<s.length() ; i++){
                    t=Character.getNumericValue(s.charAt(i));
                    if(t%2==1 && flag){
                        temp=t/2;
                        s1+=Integer.toString(temp);
                        s2+=Integer.toString(t-temp);
                        flag=false;
                    }
                    else if(t%2==1 && !flag){
                        temp=t/2;
                        s2+=Integer.toString(temp);
                        s1+=Integer.toString(t-temp);
                        flag=true;
                    }
                    else{
                        temp=t/2;
                        s2+=Integer.toString(temp);
                        s1+=Integer.toString(temp);
                    }
                }
                int a1 = Integer.parseInt(s1) , a2 = Integer.parseInt(s2);
                System.out.println(a1+" "+a2);
            }
            else if(n%2==1){
                long num1 = (long)Math.floor(n/2);
                long num2 = num1+1;
                System.out.println(num1+" "+num2);
            }
            else {
                long num1 = n/2;
                System.out.println(num1+" "+num1);
            }
        }
    }
}