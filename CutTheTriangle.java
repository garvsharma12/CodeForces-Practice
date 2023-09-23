import java.util.*;
public class CutTheTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0 ;i<n ; i++){
            sum+=sc.nextInt();
        }
        int count=0;
        for(int i=1 ;i<=5 ; i++){
            if((sum+i)%(n+1)==1) continue;
            else count++;
        }
        System.out.println(count);
    }
}
