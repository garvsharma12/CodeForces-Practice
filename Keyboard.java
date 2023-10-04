import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        String  type = sc.nextLine();
        String s = sc.nextLine();
        String temp1 = "qwertyuiop";
        String temp2 = "asdfghjkl;";
        String temp3 = "zxcvbnm,./";

        String out="";
        if(type.equals("L")){
            for(int i=0 ;i<s.length() ;i++){
                if(temp1.indexOf(s.charAt(i))!=-1){
                    int idx = temp1.indexOf(s.charAt(i));
                    out+=""+temp1.charAt(idx+1);
                }
                else if(temp2.indexOf(s.charAt(i))!=-1){
                    int idx = temp2.indexOf(s.charAt(i));
                    out+=""+temp2.charAt(idx+1);
                }
                else{
                    int idx = temp3.indexOf(s.charAt(i));
                    out+=""+temp3.charAt(idx+1);
                }
            }
        }
        else{
            for(int i=0 ;i<s.length() ;i++){
                if(temp1.indexOf(s.charAt(i))!=-1){
                    int idx = temp1.indexOf(s.charAt(i));
                    out+=""+temp1.charAt(idx-1);
                }
                else if(temp2.indexOf(s.charAt(i))!=-1){
                    int idx = temp2.indexOf(s.charAt(i));
                    out+=""+temp2.charAt(idx-1);
                }
                else{
                    int idx = temp3.indexOf(s.charAt(i));
                    out+=""+temp3.charAt(idx-1);
                }
            }
        }
        System.out.println(out);
    }
}
