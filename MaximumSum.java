import java.util.*;
public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long sum = 0;
            ArrayList<Long> arr = new ArrayList<>(n);
            for(int i=0 ; i<n ; i++) {
                long temp = sc.nextLong();
                sum+=temp;
                arr.add(temp);
            }
            //System.out.println(sum);
            List<Long> pre = new ArrayList<>();
            Collections.sort(arr);
            System.out.println(arr);
            for(int i=0 ; i<n ; i++) {
                if(i==0) pre.add(arr.get(i));
                else{
                    long temp= pre.get(i-1)+arr.get(i);
                    pre.add(temp);
                }
            }
            System.out.println(pre);
            long req=0;
            int p=-1 ; 
            int i=1 , j=n-1;
            while(k!=0){
                if(pre.get(i)<arr.get(j)){
                    p=i;
                    i+=2;
                }
                else{
                    sum-=arr.get(j);
                    j--;
                }
                k--;
                
            }
            if(p==-1) System.out.println(sum);
            else{
                sum-=pre.get(p);
                System.out.println(sum);
            }
        }
    }
}
