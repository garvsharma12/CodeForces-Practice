import java.util.Scanner;

public class YoungScientist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int loop=3*user;
        int x=0 , y=0 , z=0 ;
        for(int i=0 ; i<loop ; i++)
        {
            int a=sc.nextInt();
            if(i==0)
                x+=a;
            else if(i%3==0)
                x+=a;
            else if(i%3==1)
                y+=a;
            else if(i%3==2) 
                z+=a;

        }
        if((x==0)&&(y==0)&&(z==0))
            System.out.println("YES"); 

        else
            System.out.println("NO");
            
        sc.close();
    }
}
