import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int n = s.length();
            if(n==1 && Character.isLowerCase(s.charAt(0)))
                System.out.println(Character.toUpperCase(s.charAt(0)));
            else if(Character.isUpperCase(s.charAt(0))&& Character.isUpperCase(s.charAt(n-1))){
                boolean b = false;
                for(int i=0 ;i<n ; i++){
                    if(Character.isLowerCase(s.charAt(i))){
                        b=true; break;
                    }
                }
                if(b) System.out.println(s);
                else {
                    String out = s.toLowerCase();
                    System.out.println(out);
                }
            }
            else if(Character.isLowerCase(s.charAt(0))&& Character.isUpperCase(s.charAt(n-1))){
                boolean b = false;
            for(int i=1 ;i<n ;i++){
                if(Character.isLowerCase(s.charAt(i))){
                    b=true;
                    break;
                }
            }
            if(b) System.out.println(s);
            else{
                Character c1=Character.toUpperCase(s.charAt(0));
                String s1 = s.substring(1, n);
                s1 = s1.toLowerCase();
                s1 = ""+c1+s1;
                System.out.println(s1);
            }
        }
        else System.out.println(s);
        }
        
    }
}
