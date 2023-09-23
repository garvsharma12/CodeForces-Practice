import java.util.Arrays;
import java.util.Scanner;

public class NegativesandPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long neg=0 , pos=0 , sumN=0 , sumP=0;
            for(int i=0 ;i<n ; i++){
                long k = sc.nextLong();
                arr[i]=k;
                if(k<0){
                    neg++;
                    sumN+=k;
                }
                else{
                    pos++;
                    sumP+=k;
                }
            } 
            if(neg%2==0){
                long temp = (-sumN)+sumP;
                System.out.println(temp);
                continue;
            }
            else if(neg%2==1 && pos>0){
                Arrays.sort(arr);
                for(int i=0 ; i<n-1; i++){
                    if(arr[i]<0 && arr[i+1]>=0){
                        if((-arr[i])>(arr[i+1])){
                        long temp = (-sumN)-arr[i+1]*2+sumP;
                        System.out.println(temp);
                        break;
                        }
                        else{
                            long temp = (-sumN)+arr[i]*2+sumP;
                            System.out.println(temp);
                            break;
                        }
                    } 
                }
            }
            else if(neg%2==1 && pos==0){
                long temp = (-sumN)+arr[n-1]*2;
                System.out.println(temp);
            }

        }
    }
}
