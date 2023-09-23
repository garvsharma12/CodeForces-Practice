import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s = sc.next();
            int val1 = Character.getNumericValue(s.charAt(0))-9;
            int val2 = Character.getNumericValue(s.charAt(1))-9;
            //System.out.println(val1+" "+val2);
            if(val1==1){
                System.out.println(val2-1);
            }
            else{
                if(val1<val2){
                int out = (val1-1)*25+(val2-1);
                System.out.println(out);
                }
                else{
                    int out = (val1-1)*25+(val2);
                System.out.println(out);
                }
            }
        }
    }
}
