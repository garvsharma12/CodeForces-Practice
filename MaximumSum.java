import java.util.*;
public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            long [] prefix = new long [n + 1];
            int idx = 1;
            long sum = 0;
            for (int num : list) {
                sum += num;
                prefix[idx++] = sum;
            }
            //System.out.println(Arrays.toString(prefix));
            int left, end;
            long result = 0;
            for (int i = 0; i <= k; ++i) {
                left = k - i;
                end = n - left;   
                result = Math.max(result, prefix[end] - prefix[2*i]);
            }
            System.out.println(result);
        }
    }
}
