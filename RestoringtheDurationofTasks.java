import java.util.Scanner;

public class RestoringtheDurationofTasks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ;i<n ;i++) a[i]=sc.nextInt();

            int[] b = new int[n]; 

            for(int i=0 ;i<n ;i++) b[i]=sc.nextInt();
            for(int i=0 ;i<n;i++){
                if(i==0){
                    System.out.print(b[i]-a[i]+" ");
                }
                else if(a[i]>=a[i-1] && a[i]<=b[i-1]){
                    System.out.print(b[i]-b[i-1]+" ");
                }
                else {
                    System.out.print(b[i]-a[i]+" ");
                }
            }
            System.out.println();
        }
    }
}