import java.util.Arrays;
import java.util.Scanner;

public class MissingBigram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String[] ar = s.split(" ");
            String[] arr = new String[n-2];
            for(int i=0 ;i<n-2 ; i++)  arr[i]=ar[i];
            //System.out.println(Arrays.toString(arr));
            String out="";
            if(n-2==1){
                if(arr[0].charAt(0)=='b'){
                out="a"+arr[0];
                System.out.println(out);
                continue;
                }
                else{
                    out="b"+arr[0];
                System.out.println(out);
                continue;
                }
            }
            Boolean b = true;
            out+=""+arr[0].charAt(0);
            for(int i=0 ;i<n-3 ; i++){
                if(arr[i].charAt(1)==arr[i+1].charAt(0)){
                    out+=""+arr[i].charAt(1);
                }
                else{
                    b=false;
                    out+=""+arr[i].charAt(1);
                    out+=""+arr[i+1].charAt(0);
                }
            }
            out+=""+arr[n-3].charAt(1);
            if(b) out+=""+arr[n-3].charAt(1);
            System.out.println(out);
        }
    }
}
