import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
public class Elections{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int[] arr = new int[3];
            for(int i=0 ;i<3 ; i++) arr[i]=sc.nextInt();
            if(arr[0]==arr[1] && arr[1]==arr[2]){
                System.out.println((arr[0]+1)+" "+(arr[1]+1)+" "+(arr[2]+1));
                continue;
            }
            int mx = Arrays.stream(arr).max().getAsInt();
            for(int i=0 ;i<3 ; i++){
                if(arr[i]==mx) System.out.print(0+" ");
                else System.out.print(mx-arr[i]+1+" ");
            }
            System.out.println();
        }
    } 
}