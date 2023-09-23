import java.util.Scanner;

public class MaximalContinousRest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="";
        for(int i=0 ; i<n ; i++){
            int k = sc.nextInt();
            str+=Integer.toString(k);
        }
        str=str.repeat(2);
        int mx=0 , count=0;
        for(int i=0;i<2*n-1 ; i++){
            if(str.charAt(i)=='1'&& str.charAt(i+1)=='1'){
                count+=2;
                i++;
                mx = Math.max(count,mx);
            }
            else if(str.charAt(i)=='1'&& str.charAt(i+1)=='0'){
                count++;
                mx = Math.max(count,mx);
                count=0;
            }
            else count=0;
        }
        //System.out.println(str);
        System.out.println(mx);
    }
}
