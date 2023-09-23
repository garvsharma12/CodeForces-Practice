import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class PermutationCSES {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int n = sc.nextInt();
        if(n==1) System.out.println(1);
        else if(n<=3) System.out.println("NO SOLUTION");
        else if(n==4){
            System.out.println("2 4 1 3");
        }
        else{
            if(n%2!=0){
                System.out.print((int)Math.ceil((double)(n)/2)+" ");
                for(int i=1,j=n ; i<j; i++ , j--){
                    System.out.print(i+" "+j+" ");
                }
            }
            else{
                System.out.println((n/2)+1+" ");
                for(int i=1,j=n ; i<j ; i++,j--){
                    if(i==n/2) System.out.print(i);
                    else 
                    System.out.print(i+" "+j+" ");
                }
            }
        }
    }
}
