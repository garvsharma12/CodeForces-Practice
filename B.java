import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            if(n==1){
                int num = sc.nextInt();
                System.out.println("YES");
                continue;
            }
            String res="YES";
            boolean[] b = new boolean[n];
            Arrays.fill(b,false);
            for(int i=1 ; i<=n ;i++){
                int x = sc.nextInt();
                x--;
                if(i==1) b[x]=true;
                else{
                    if(x==0){
                        if(b[1]){
                            b[0]=true;
                        }
                        else{
                            res="NO";
                        }
                    }
                    else if(x==n-1){
                        if(b[n-2]){
                            b[n-1]=true;
                        }
                        else{
                            res="NO";
                        }
                    }
                    else if(b[x-1] || b[x+1]){
                        b[x]=true;
                    }
                    else{
                        res="NO";
                    }
                }
            }
            System.out.println(res);
        }
        
}
}
