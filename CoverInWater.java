import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            sc.nextLine();
            char[] input = sc.nextLine().toCharArray();
            int res=0;
            boolean b=true;
            if(n<3){
                for(char c:input){
                    if(c=='.') res++;
                }
                b=false;
            }
            else{
                for(int i=1 ; i<n-1 ; i++){
                    if(input[i]=='.' && input[i-1]=='.' && input[i+1]=='.'){
                        res=2;
                        b=false;
                        break;
                    }
                }
                if(b){
                    for(char c:input){
                        if(c=='.') res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
