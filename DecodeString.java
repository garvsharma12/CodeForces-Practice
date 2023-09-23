import java.util.Scanner;
public class DecodeString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int len = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine() , out="";
                if(len==1){
                    int val = Character.getNumericValue(s.charAt(0));
                    out+=""+(char)(val+96);
                    System.out.println(out);
                    continue;
                }
                else if(len==2){
                    int val = Character.getNumericValue(s.charAt(0));
                    out+=""+(char)(val+96);
                    val = Character.getNumericValue(s.charAt(1));
                    out+=""+(char)(val+96);
                    System.out.println(out);
                    continue;
                }
                //boolean[] b = new boolean[len];
                for(int i=len-1 ; i>=0 ; i--){
                    if(s.charAt(i)=='0'){
                        String sub = s.substring(i-2,i);
                        int val = Integer.parseInt(sub);
                        out+=""+(char)(val+96);
                        i-=2;
                    }
                    else {
                        int val = Character.getNumericValue(s.charAt(i));
                        out+=""+(char)(val+96);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(out);
                sb.reverse();
                System.out.println(sb);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
