import java.util.Scanner;
public class PathWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int out=0;
            for(int i=0 ; i<n ;i++){
                int temp = sc.nextInt();
                if(temp<=k) 
                    k-=temp;
                else if(temp>k && k>0){
                    temp-=k; 
                    out+=temp;
                    k=0;
                }
                else out+=temp;
            }
            System.out.println(out);
        }
    }
}
