import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String s1 =sc.nextLine() , s2 = sc.nextLine() , s3 = sc.nextLine();
            if(s1.charAt(0)!='.' && s1.charAt(0)==s2.charAt(1) && s2.charAt(1)==s3.charAt(2))
                System.out.println(s1.charAt(0));
            else if(s1.charAt(2)!='.' && s1.charAt(2)==s2.charAt(1) && s2.charAt(1)==s3.charAt(0)) 
                System.out.println(s1.charAt(2));


            else if(s1.charAt(0)!='.' && s1.charAt(0)==s1.charAt(1) && s1.charAt(1)==s1.charAt(2))
                System.out.println(s1.charAt(2));
            else if(s2.charAt(0)!='.' && s2.charAt(0)==s2.charAt(1) && s2.charAt(1)==s2.charAt(2))
                System.out.println(s2.charAt(2));
            else if(s3.charAt(0)!='.' && s3.charAt(0)==s3.charAt(1) && s3.charAt(1)==s3.charAt(2))
                System.out.println(s3.charAt(2));
            else if(s1.charAt(0)!='.' && s1.charAt(0)==s2.charAt(0) && s2.charAt(0)==s3.charAt(0))
                System.out.println(s3.charAt(0));
            //else if(s1.charAt(0)!='.' && s1.charAt(0)==s2.charAt(0) && s2.charAt(0)==s3.charAt(0))
              //  System.out.println(s3.charAt(0));
            else if(s1.charAt(1)!='.' && s1.charAt(1)==s2.charAt(1) && s2.charAt(1)==s3.charAt(1))
                System.out.println(s3.charAt(1));
            else if(s1.charAt(2)!='.' && s1.charAt(2)==s2.charAt(2) && s2.charAt(2)==s3.charAt(2))
                System.out.println(s3.charAt(2));
            else System.out.println("DRAW");
        }
    }
}
