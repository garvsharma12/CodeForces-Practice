import java.util.Scanner;
public class AddPlusMinusSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();

        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int val=0; String out="";
            for(int i=0;i<n; i++){
                if(i==0){
                    if(s.charAt(i)=='0' && s.charAt(i+1)=='0') out+="+";
                    else if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                        out+="+";
                        val++;
                    }
                    else if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                        out+="+";
                        val++;
                    }
                    else out+="-";
                    i++;
                }
                else if(val==0 && s.charAt(i)=='0') out+="+";
                else if(val==0 && s.charAt(i)=='1'){
                    out+="+"; val++;
                }
                else if(val==1 && s.charAt(i)=='0') out+="+";
                else{
                    out+="-"; val--;
                }
            }
            System.out.println(out);
        }
    }
}
