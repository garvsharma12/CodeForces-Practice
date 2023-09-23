import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildingPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for(int i=0 ; i<n ; i++)
            arr.add(sc.nextInt());
        long count=0;
        Collections.sort(arr);
        for(int i=0 ; i<n ; i++)
            count+=(Math.abs(arr.get(i)-(i+1)));

        System.out.println(count);

        sc.close();
    }
}
