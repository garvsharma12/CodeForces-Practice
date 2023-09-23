import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BicycleChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++)
            a[i]=sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0 ; i<m ; i++)
            b[i]=sc.nextInt();

        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(b[j]%a[i]==0)
                    temp.add(b[j]/a[i]);
            }
        }
        int count=0;
        int mx = Collections.max(temp);
        for(int i=0 ; i<temp.size() ; i++)
        {
            if(temp.get(i)==mx)
                count++;
        }
        System.out.println(count);

        sc.close();
    }
}
