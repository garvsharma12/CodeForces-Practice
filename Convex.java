import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Convex {
    static long[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            boolean b = true;
            int x = sc.nextInt();
            arr = new long[x];
            arr[0]=1;
            arr[1]=1;
            List<Integer> ll = new ArrayList<>();
            for(int i=1; i<x ; i++)
            {
                long val = arr[i]!=0?arr[i]:fact(i-1);
                if(((val+val*i)%x)==0)
                    ll.add(i);
            }
            if(ll.size()==0)
                System.out.println(-1);
            else
                System.out.println(ll.get(ll.size()-1));
        }

        sc.close();
    }
    static long fact(int k)
    {
        if(k==0 || k==1)
            return 1;
        if(arr[k]!=0)
        return arr[k];
        return arr[k] = (k*fact(k-1));
    }
}

