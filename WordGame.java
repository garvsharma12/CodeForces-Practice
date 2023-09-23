import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String user =sc.nextLine();
            String user2 = sc.nextLine();
            String user3 = sc.nextLine();
            user=user+" "+user2+" "+user3;
            String[] a2 = user.split(" ");
           // System.out.println(Arrays.toString(a2));
            HashMap<String,Integer> hm = new HashMap<>();
            for(int i=0 ;i<3*n ; i++){
                if (hm.containsKey(a2[i])) {
                    hm.put(a2[i],hm.get(a2[i]) + 1);
                }
                else {
                    hm.put(a2[i], 1);
                }
            }
            int[] out = new int[3];
            int k=0 , temp=0;
            for(int i=0 ; i<3*n ; i++){
                if(hm.get(a2[i])==1) temp+=3;
                else if(hm.get(a2[i])==2) temp+=1;

                if((i+1)%n==0){
                    out[k]=temp;
                    k++; temp=0;
                }
            }
            //System.out.println(hm);
            for(int i=0 ; i<3 ; i++) System.out.print(out[i]+" ");
            System.out.println();
        }
    }
}
