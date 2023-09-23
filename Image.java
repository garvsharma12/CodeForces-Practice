import java.util.*;
public class Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            HashSet<Character> hs = new HashSet<>();
            hs.add(s1.charAt(0)); hs.add(s1.charAt(1));
            hs.add(s2.charAt(0)); hs.add(s2.charAt(1));
            System.out.println(hs.size()-1);
        }
    }
}
