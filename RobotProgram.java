import java.util.*;
import java.lang.*;
import java.io.*;

public class RobotProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            long out =0;
            if(l==r){
                out=l*2;
            }
            else if(l==0 && r!=0){
                out = (r*2)-1;
            }
            else if(r==0 && l!=0){
                out = (l*2)-1;
            }
            else{
                if(l>r)
                    out=l+r+(l-r-1);
                else 
                    out=r+l+(r-l-1);
            }
            System.out.println(out);
        }
    }
}