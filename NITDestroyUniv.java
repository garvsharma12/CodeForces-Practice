import java.util.Scanner;

public class NITDestroyUniv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n =sc.nextInt();
            int[] arr = new int[n+2];
            arr[0]=0;
            boolean b0 =true;
            for(int i=1 ;i<=n ;i++){
                arr[i]=sc.nextInt();
                if(arr[i]!=0) b0=false;
            }
            arr[n+1]=0;
            int count=0;
            if(b0){
                System.out.println(0); continue;
            }
            boolean srt=false;
            for(int i=0 ;i<=n;i++){
                if(arr[i]==0 && arr[i+1]!=0){
                    srt=true;
                }
                else if(arr[i]!=0 && arr[i+1]==0 && srt){
                    count++; srt=false;
                }
            }  
            if(count>1) System.out.println(2);
            else System.out.println(1);
        }
    }
}
