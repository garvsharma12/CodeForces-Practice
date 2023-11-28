import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0,total=n;

        if(n<m) System.out.println(n);
        else{
        int i=1;
        while(i<=total){
            if(i%m==0) total+=1;
            i++;
        }
        System.out.println(total);
        }
    }
}
