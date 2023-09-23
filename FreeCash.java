import java.util.Collections;
import java.util.HashMap;
//import java.util.stream.*;
import java.util.Scanner;

public class FreeCash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size*2];
        for(int i=0 ; i<size*2 ; i++)
            arr[i]=sc.nextInt();

        int count=0;
        HashMap<String,Integer> h = new HashMap<>();
        for(int i=0 , j=1 ; i<=size*2-2 && j<=size*2-1 ; i+=2 , j+=2)
        {
            String time = Integer.toString(arr[i])+":"+Integer.toString(arr[j]);
            h.put(time,h.getOrDefault(time,0)+1);
        }
        count=(Collections.max(h.values()));
        System.out.println(count);

        sc.close();

    }
}
