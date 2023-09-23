import java.util.Scanner;
public class SSeeeeiinnggDDoouubbllee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s = sc.nextLine();
            StringBuilder s1 = new StringBuilder();
            s1.append(s);
            s1.reverse();
            String s2 = new String(s1);
            s+=s2;
            System.out.println(s);
        }
    }
}