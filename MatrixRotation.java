import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int i=0; boolean bool =true;
            while(i!=4){
                if((a<b)&&(c<d)&&(a<c)&&(d>b)){
                    System.out.println("YES");
                    bool = false;
                    break;
                }
                else{
                    int temp1 = a;
                    int temp2 = b;
                    a=c; b=temp1 ; int temp3 = d;
                    d=temp2 ; c=temp3;
                }
                i++;
            }
            if(bool) System.out.println("NO");
        }
    }
}
