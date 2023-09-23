import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AvoidingZero{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt = sc.nextInt();
            while(tt-->0){
                int n = sc.nextInt();
                int sum=0 , sumN=0 , sumP=0 , count0=0;
                List<Integer> arrN = new ArrayList<>();
                List<Integer> arrP = new ArrayList<>();
                for(int i=0 ;i<n ; i++){
                    int k=sc.nextInt();
                    if(k<0){
                         arrN.add((k));
                         sumN+=(-k);
                    }
                    else{
                        if(k==0){ count0++; continue;}
                        arrP.add(k);
                        sumP+=k;
                    }
                    sum+=k;
                }
                if(sum==0) System.out.println("NO");
                else{
                    System.out.println("YES");
                    if(sumN<sumP){
                        for(int i : arrP){
                            System.out.print(i+" ");
                        }
                        for(int i : arrN) System.out.print(i+" ");
                        for(int i=0 ; i<count0 ;i++) System.out.print("0"+" ");
                        System.out.println();
                    }
                    else{
                        for(int i : arrN){
                            System.out.print(i+" ");
                        }
                        for(int i : arrP) System.out.print(i+" ");
                        for(int i=0 ; i<count0 ;i++) System.out.print("0"+" ");
                        System.out.println();

                    }
                }
                
            }
        }
    }
}