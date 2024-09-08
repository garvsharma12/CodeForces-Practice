import java.util.*;

public class PermutationCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            int[][] mat = new int[n][n-1];
            for(int i=0 ;i<n ; i++){
                for(int j=0 ;j<n-1 ; j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            int[] res = new int[n];
            int idx=0;
            HashMap<Integer,Integer> hm = new LinkedHashMap<>();
            for(int i=0 ;i<n-1 ; i++){
                for(int j=0 ;j<n ; j++){
                    hm.put(mat[j][i],hm.getOrDefault(mat[j][i],0)+1);
                }
                int ky =  Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
                res[idx++]=ky;
                hm.remove(ky);
                //System.out.println(ky);
            }
            for(int k:hm.keySet()){
                res[idx]=k;
                break;
            }
            for(int x:res) System.out.print(x+" ");
            System.out.println();
        }
    }
}
