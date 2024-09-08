import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt= sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s = sc.nextLine();
            int len = s.length();
            if(len==1){
                if(s.charAt(0)=='z'){
                    s+="a";
                }
                else{
                    int ascii = (int)(s.charAt(0));
                    char chr = (char)(ascii+1);
                    s+=""+chr;
                }
                System.out.println(s);
                continue;
            }
            boolean b = true;
            String res="";
            for(int i=0 ; i<len-1;i++){
                if(s.charAt(i)==s.charAt(i+1) && b){
                    res=s.substring(0,i+1);
                    if(s.charAt(i)=='z'){
                        res+="a";
                    }
                    else{
                        int ascii = (int)(s.charAt(i));
                        char chr = (char)(ascii+1);
                        res+=""+chr;
                    }
                    res+=s.substring(i+1);
                    b=false;
                    break;
                }
            }
            if(b){
                if(s.charAt(len-1)=='z'){
                    s+="a";
                }
                else{
                    int ascii = (int)(s.charAt(len-1));
                    char chr = (char)(ascii+1);
                    s+=""+chr;
                }
                System.out.println(s);
            }
            else 
            System.out.println(res);
        }
    }
}
