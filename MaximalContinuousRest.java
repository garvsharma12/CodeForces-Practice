import java.util.Scanner;

public class MaximalContinuousRest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ;i<n ;i++) arr[i]=sc.nextInt();
        int srt=0;
        for(int i=0 ;i< n-1;i++){
            if(arr[i]==1 && arr[i+1]==1 && i==0) srt+=2;
            else if(arr[i]==1 && arr[i+1]==0 && i==0){ srt++; break;}
            else if(arr[i]==1 && arr[i+1]==1) srt++;
            else break;
        }
        int btw=0 , mxbw=0;
        for(int i=0 ;i< n-1;i++){
            if(arr[i]==1 && arr[i+1]==1 && btw==0) btw+=2;
            else if(arr[i]==1 && arr[i+1]==1) btw++;
            else {
                mxbw=Math.max(btw,mxbw);
                btw=0;
            }
        }
        int end=0;
        for(int i=n-1 ;i>=1;i--){
            if(arr[i]==1 && arr[i-1]==1 && i==n-1) end+=2;
            else if(arr[i]==1 && arr[i-1]!=1 && i==n-1){ end++; break ; }
            else if(arr[i]==1 && arr[i-1]==1) end++;
            else break;
        }
        //System.out.println(mxbw+" "+srt+" "+end);
        int out = Math.max(mxbw,srt+end);
        System.out.println(out);
    }
}
