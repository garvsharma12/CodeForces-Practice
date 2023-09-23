import java.util.*;
import java.lang.*;
import java.io.*;
public class MakeProEquals1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr = new int[n];
            int neg1=0 , pos1=0 , maxNeg=0 , minPos=Integer.MAX_VALUE , pro=1 ,count=0;long out=0;
            for(int i=0 ;i<n ; i++){ arr[i]=sc.nextInt();
                if(arr[i]>=0){
                    out+=Math.abs(arr[i]-1);
                    minPos=Math.min(minPos,arr[i]);
                    pro*=1;
                    if(arr[i]==0) count++;
                }
                else if(arr[i]<0){
                    out+=Math.abs(arr[i]+1);
                    maxNeg=Math.max(maxNeg,arr[i]);
                    pro*=-1;
                }
            }
            if(pro==1) System.out.println(out);
            else{
                if(count>0){
                    System.out.println(out);
                }
                else{
                out+=2;
                System.out.println(out);}
            }
    }
}
