import java.util.Scanner;

public class Div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop-->0)
        {
            int n = sc.nextInt();
            if(n%7==0) System.out.println(n);
            else if(n<10) System.out.println(7);
            else 
            {
                String s = Integer.toString(n);
                String s1 = s.substring(0,s.length()-1);
                String temp="";
                for(int i=0 ; i<10 ;i++)
                {
                    temp=Integer.toString(i);
                    String s2 = s1+temp;
                    if(Integer.parseInt(s2)%7==0){
                        System.out.println(s2);
                        break;}
                }
            }
        }
    
        sc.close();
    }
}
