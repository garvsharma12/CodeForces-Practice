import java.util.HashMap;
import java.util.Scanner;
public class SupercentralPoint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            HashMap<Integer,Integer> hm1 = new HashMap<>();
            HashMap<Integer,Integer> hm2 = new HashMap<>();
            int mx1 = Integer.MIN_VALUE , mx2 = Integer.MIN_VALUE , mn1 = Integer.MAX_VALUE , mn2 = Integer.MAX_VALUE; 
            for(int i=0 ; i<n ; i++)
            {
                 a1[i] = sc.nextInt();
                 if(a1[i]<mn1) mn1= a1[i];
                 else if(a1[i]>mx1) mx1 = a1[i];

                 if(hm1.containsKey(a1[i])) hm1.put(a1[i],hm1.get(a1[i])+1);
                 else hm1.put(a1[i],1);

                 a2[i] = sc.nextInt();
                 if(a2[i]<mn2) mn2= a2[i];
                 else if(a2[i]>mx2) mx2 = a2[i];

                 if(hm2.containsKey(a2[i])) hm2.put(a2[i],hm2.get(a2[i])+1);
                 else hm2.put(a2[i],1);
            }

            int count =0 ;
            for(int i=0 ;i<n ; i++){
                boolean b1 = false , b2 = false  , b3 = false , b4 = false;
                if((a1[i]>mn1 && a1[i]<mx1)&&(a2[i]>mn2 && a2[i]<mx2)){
                    for(int j=0 ; j<n ; j++){
                        if(a1[j]>a1[i] && a2[j]==a2[i]) b1=true;
                        else if(a1[j]<a1[i] && a2[j]==a2[i]) b2=true;
                        else if(a1[j]==a1[i] && a2[j]>a2[i]) b3=true;
                        else if(a1[j]==a1[i] && a2[j]<a2[i]) b4=true;
                    }
                    if(b1&& b2 && b3 && b4) count++;
                    //System.out.println(a1[i]+"&"+a2[i]);
                }
                else continue;
            }
            System.out.println(count);
        }
       
    }
    
}
 