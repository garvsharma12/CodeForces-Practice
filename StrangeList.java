import java.util.*;
public class StrangeList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int sum=0;
            List<Integer> al = new ArrayList<>();
            boolean boo = true;
            for(int i=0 ;i<n ;i++){
                int temp = sc.nextInt();
                sum+=temp;
                if(temp%q!=0){
                    System.out.println(sum);
                    boo = false;
                    break;
                }
                else{
                    sum+=temp;
                    for(int j=1 ; j<=q ; j++) al.add(temp/q);
                }
                al.add(temp);
            }
            int idx=n;
            while(al.isEmpty()){
                int x=al.get(idx);
                if(x%q!=0){
                    System.out.println(sum);
                    boo = false;
                    break;
                }
                else{
                    sum+=x;
                    for(int i=1 ; i<=x ; i++) al.add(x/q);
                }
            }
            if(boo) System.out.println(sum);
        }
    }
}
