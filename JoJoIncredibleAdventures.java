import java.math.BigInteger;
import java.util.Scanner;

public class JoJoIncredibleAdventures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            long mx = Long.MIN_VALUE;
            long temp=1 , zr=0 ,one=0;
            for(int i=0 ;i<s.length()-1 ;i++)
            {
                if(s.charAt(i)=='0') zr++;
                if(s.charAt(i)=='1') one++;
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                    temp++;
                    //i++;
                    mx=Math.max(mx,temp);
                }
                else temp=1;
            }
            if(s.length()>1&& s.charAt(s.length()-1)=='0') zr++;
            else if(s.length()>1 && s.charAt(s.length()-1)=='1') one++;
            //System.out.println(mx+"&");
            long count=0 ;
            if(s.charAt(0)=='1' && s.charAt(s.length()-1)=='1' && s.length()>2){
                for(int i=0 , j=s.length()-1 ; i<j ; ){
                    if(s.charAt(i)=='1'){ count++;
                        i++;}
                    if(s.charAt(j)=='1'){
                        count++;
                        j--;
                    }
                    else if(s.charAt(i)=='0'&& s.charAt(j)=='0') break;
                }
            }
            mx=Math.max(mx,count);
           // System.out.println(mx+"#");
            //System.out.println(one+"!"+zr);
            if(zr==s.length()) System.out.println(0);
            else if(s.length()==1 && s.charAt(0)=='0') System.out.println(0);
            else if(one==s.length()) {
                String z = Long.toString(one);
                BigInteger b1 = new BigInteger(z);
                BigInteger b2 = b1.multiply(b1); 
                System.out.println(b2);
                //System.out.println("Yes");
            }
            else if (mx==0) System.out.println(1);
            else{
                mx++;
                double p = (double)mx;
                //System.out.println(mx);
                double k = p/2;
                //System.out.println(k);
                long a = (long)(Math.floor(p/2));
                long b = (long)(Math.ceil(p/2));
                long out = (long)a*b;
                System.out.println(out);
            }
        }
    }
}
