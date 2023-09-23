import java.util.Scanner;

public class MinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int tt =sc.nextInt();
		while(tt-->0){
		    int n = sc.nextInt();
		    String out="";
		    //int i=9;
		    for(int i=9 ; i>=1 ; i--){
		        if(i<=n){
		            out+=Integer.toString(i);
		            n-=i;
		        }
		    }
		    System.out.println(out);
		    StringBuffer sb = new StringBuffer();
		    sb.append(out);
		    sb.reverse();
		    System.out.println(sb);
		}
    }
}
