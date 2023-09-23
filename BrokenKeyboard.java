import java.util.Scanner;

public class BrokenKeyboard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int len = s.length();
            int k=0;
            if(len==1){ System.out.println(s); continue;}
            else{
                boolean[] b = new boolean[27];
                //int[] count = new int[27];

                for(int i=0 ;i<len; i++){
                    if(i==len-1) b[s.charAt(i)-97]=true;
                    else if(s.charAt(i)==s.charAt(i+1)){
                        i++;
                    }
                    else if(s.charAt(i)!=s.charAt(i+1)){
                        b[s.charAt(i)-97]=true;
                        
                    }
                }
                
                String out="";
                for(int i=0 ;i<27 ;i++){
                    if(b[i]) out+=""+(char)(i+97);
                }
                System.out.println(out);

            }
        }
    }
}