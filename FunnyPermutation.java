import java.util.Scanner;

public class FunnyPermutation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tt = sc.nextInt();
            while(tt-->0){
                int t = sc.nextInt();
                if(t==3) System.out.println(-1);
                else if(t==5) System.out.println("5 4 1 2 3");
                else if(t%2==0){
                    for(int i=t ; i>0 ; i--) System.out.print(i+" ");
                    System.out.println();
                }
                else{
                    int mid = (int)Math.ceil((double)t/2);
                    //System.out.println(mid);
                    for(int i=t ; i>0 ; i--){
                        if(i==mid){
                            System.out.print(mid-1+" "+mid+" ");
                            i-=1;
                        }
                        else System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
