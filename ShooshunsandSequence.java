import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ShooshunsandSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        int[] freq = new int[100001];
        for(int i=0 ; i<n ; i++)
        {
            arr.add(sc.nextInt());
            freq[arr.get(i)]++;
        }
        int mx = Arrays.stream(freq).max().getAsInt();
        if(mx==n)
            System.out.println(0);
        else 
        {
        String chk = Arrays.toString(arr.toArray());
        int count=0;
        //boolean b =true;
        String temp="";
        while(true)
        {
            arr.add(arr.get(k-1));
            freq[arr.get(k-1)]++;
            freq[arr.get(0)]--;
            arr.remove(arr.get(0));
            temp=Arrays.toString(arr.toArray());
            if(temp.equals(chk))
            {
                System.out.println(-1);
                break;
            }
            else 
            {
                count++;
                int mxx=Arrays.stream(freq).max().getAsInt();
                if(mxx==n) 
                {
                    System.out.println(count);
                    break;
                }
            }
        }

        }
        sc.close();
    }
}
