import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            int out=0;
            for(int i=0 ;i<10 ;i++){
                String s=sc.nextLine();
                if(i==0||i==9){
                    for(int j=0 ;j<10 ;j++){
                        if(s.charAt(j)=='X') out++;
                    }
                }
                else if(i==1||i==8){
                    for(int j=0 ;j<10 ;j++){
                        if(s.charAt(j)=='X'&& (j==0|| j==9)) out++;
                        else if(s.charAt(j)=='X') out+=2;
                    }
                }
                else if(i==2||i==7){
                    for(int j=0 ;j<10 ;j++){
                        if(s.charAt(j)=='X'&& (j==0|| j==9)) out++;
                        else if(s.charAt(j)=='X'&& (j==1|| j==8)) out+=2;
                        else if(s.charAt(j)=='X') out+=3;
                    }
                }
                else if(i==3||i==6){
                    for(int j=0 ;j<10 ;j++){
                        if(s.charAt(j)=='X'&& (j==0|| j==9)) out++;
                        else if(s.charAt(j)=='X'&& (j==1|| j==8)) out+=2;
                        else if(s.charAt(j)=='X' && (j==2 || j==7)) out+=3;
                        else if(s.charAt(j)=='X') out+=4;
                    }
                }
                else if(i==4||i==5){
                    for(int j=0 ;j<10 ;j++){
                        if(s.charAt(j)=='X'&& (j==0|| j==9)) out++;
                        else if(s.charAt(j)=='X'&& (j==1|| j==8)) out+=2;
                        else if(s.charAt(j)=='X' && (j==2 || j==7)) out+=3;
                        else if(s.charAt(j)=='X' && (j==3 || j==6)) out+=4;
                        else if(s.charAt(j)=='X') out+=5;
                    }
                }
            }
            System.out.println(out);
        }
    }
}
