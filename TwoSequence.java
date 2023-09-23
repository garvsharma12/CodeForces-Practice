import java.util.Scanner;

public class TwoSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String s1="" , s2="";
            int min =Integer.MAX_VALUE;
            for(int i=0 ;i<s.length() ;i++){
                if((int)s.charAt(i)<min) {
                    min=(int)s.charAt(i);
                }
            }
           // System.out.println("min is "+min);
            s1=""+(char)(min);
            boolean b = true;
            for(int i=0 ;i<s.length() ;i++){
                //System.out.println(Character.getNumericValue(s.charAt(i)));
                if((int)(s.charAt(i))==min && b){
                    b=false;
                    continue;
                }
                else 
                s2+=""+s.charAt(i);
            }
            System.out.println(s1+" "+s2);
        }
    }
}
