import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0,j=0 ; i<n && j<n; i++,j++)
        {
            arr1[i]=sc.nextInt();
            arr2[j]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        int mx=arr2[0];
        int cap =arr2[0];
        for(int i=1 ; i<n ; i++)
        {
            cap-=arr1[i];
            cap+=arr2[i];
            mx=Math.max(mx,cap);
        }
        System.out.println(mx);
        sc.close();
    }
}
