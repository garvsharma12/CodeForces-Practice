import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String out="";
        if(n%2!=0){
        for(int i=0 ;i<n ;i++){
            if(i%2==0){
                out+=""+s.charAt(i);
            }
            else out=""+s.charAt(i)+out;
        }
        System.out.println(out);
    }
    else {
        for(int i=0 ;i<n ;i++){
            if(i%2!=0){
                out+=""+s.charAt(i);
            }
            else out=""+s.charAt(i)+out;
        }
        System.out.println(out);
    }
    }
}
