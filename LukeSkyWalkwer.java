import java.util.Scanner;

public class LukeSkyWalkwer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            String s = Integer.toString(n) , out="";
            for(int i=0 ; i<s.length() ; i++){
                int temp=(9-Character.getNumericValue(s.charAt(i)));
                if(temp<Character.getNumericValue(s.charAt(i)))
                    out+=""+temp;
                else{
                    out+=""+(s.charAt(i));
                }
            }
            n = Integer.parseInt(out);
            System.out.println(n);
        }
    }
}
