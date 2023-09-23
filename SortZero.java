import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            ArrayList<Integer> ar = new ArrayList<>();
            for(int i=0 ;i<n ;i++) ar.add(sc.nextInt());

            int count=0;
            for(int i=0 ;i<n-1 ; i++){
                if(ar.get(i)>ar.get(i+1)){
                    count+=2;
                    Collections.replaceAll(ar, ar.get(i), 0);
                    Collections.replaceAll(ar, ar.get(i+1), 0);
                }
                else if(ar.get(i)==ar.get(i+1) && ar.get(i)!=0){
                    count+=1;
                    Collections.replaceAll(ar, ar.get(i), 0);
                    //i++;
                }
            }
            System.out.println(ar);
            System.out.println(count);
        }
    }
}
