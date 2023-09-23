import java.util.Scanner;
public class GregWorkout {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n==1) System.out.println("chest");
            else if(n==2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a>b) System.out.println("chest");
                else System.out.println("biceps");
            }
            else if(n==3){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a>b && a>c) System.out.println("chest");
                else if(b>a && b>c) System.out.println("biceps");
                else System.out.println("back");
            }
            else{
                int a=0 , b=0 , c=0;
                for(int i=1 ;i<=n ; i++)
                {
                    int k = sc.nextInt();
                    if(i%3==1) a+=k;
                    else if(i%3==2) b+=k;
                    else c+=k;
                }
                //System.out.println(a+" "+b+" "+c);
                if(a>b && a>c) System.out.println("chest");
                else if(b>a && b>c) System.out.println("biceps");
                else System.out.println("back");
            }
        }
    }
}
