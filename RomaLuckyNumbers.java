import java.util.Scanner;

public class RomaLuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt();

        int output =0;
        for(int j=0 ; j<n ; j++)
        {
            int temp=0;
            String s = Integer.toString(arr[j]);
            for(int i=0 ; i<s.length() ; i++)
            {
                if(s.charAt(i)=='4'|| s.charAt(i)=='7')
                    temp++;

                if(temp>k) break;
                if(i==s.length()-1 && temp<=k) output++;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
