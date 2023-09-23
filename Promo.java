import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Promo {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int q = sc.nextInt();
       ArrayList<Integer> arr= new ArrayList<>();
       for(int i=0 ;i<n ;i++) arr.add(sc.nextInt());
       Collections.sort(arr);
       for(int i=1 ; i<n ; i++){
            int temp=arr.get(i)+arr.get(i-1);
            arr.set(i,temp);
       }
       while(q-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            long out = arr.get(n-x+y-1)-(x==n?0:arr.get(n-x-1));
            System.out.println(out);
       }

    }
}

