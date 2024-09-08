import java.util.Scanner;

public class Color_balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int res=0 , req=1,odd=0,even=0;
        if(r<=b){
            odd=b; even=r;
        }
        else{
            odd=r ; even=b;
        }
        boolean boo =true;
        while(odd>0 && even>0){
            if(req%2==1){
                if(odd<0){
                    System.out.println(res); boo=false;
                    break;
                }
                if(odd-req<0){
                    System.out.println(res); boo=false; break;
                }
                odd-=req;
                req++; res++;
            }
            else{
                if(even<0){
                    System.out.println(res); boo=false;
                    break;
                }
                if(even-req<0){
                    System.out.println(res);boo=false; break;
                }
                even-=req;
                req++; res++;
            }
        }
        if(boo) System.out.println(res);
    }
}
