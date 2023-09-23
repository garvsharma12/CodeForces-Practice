import java.util.Scanner;

public class SorTheSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int l=0 , r=0;
            for(int i=0 ; i<n ;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0 ; i<n ; i++){
                b[i]=sc.nextInt();
            }
            boolean boo1=true , boo2=true; 
            for(int i=0 , j=n-1;i<j ;){
                if( boo1 &&a[i]!=b[i]) {
                    boo1=false;
                    l=i+1;
                }
                if(a[j]!=b[j] && boo2){
                    boo2=false;
                    r=j+1;
                }
                if(boo1) i++;
                if(boo2) j--;
                if(boo1==false && boo2==false) break;
            }
            if(l==0 && r==0) System.out.println(1+" "+n);
            else if(l==0 && r!=0) System.out.println(1+" "+r);
            else if(l!=0 && r==0) System.out.println(l+" "+n);
            else{ 
                if(l!=1){
                for(int p=l-1 ; p>0 ; p--){
                    if(b[p-1]<=b[p]) l=p;
                    else break;
                }
            }
            if(r!=n){
                for(int o=r-1 ; r<n ; o++){
                    if(b[o]<=b[o+1]) r=o+2;
                    else break;
                }
            }
                System.out.println(l+" "+r);
            }
        }
    }
}
