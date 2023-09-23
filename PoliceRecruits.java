import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            int out=0 , pol=0  ; 
            for(int i=0 ;i<n ;i++){
                int k = sc.nextInt();
                if(k==-1) {
                    if(pol>0){
                        pol--;
                    }
                    else out++;
                }
                else pol+=k;
            } 
            System.out.println(out);
        }
    }
}
