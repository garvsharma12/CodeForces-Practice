import java.util.Scanner;
public class Cati {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                boolean f =true , h=true;;
                int m=0 , e=0 , o=0 , w=0;
                for(int i=0 ; i<n ; i++)
                {
                    if(s.charAt(i)=='m' || s.charAt(i)=='M') m++;
                    else if(s.charAt(i)=='e' || s.charAt(i)=='E') e++;
                    else if(s.charAt(i)=='o' || s.charAt(i)=='O') o++;
                    else if(s.charAt(i)=='w' || s.charAt(i)=='W') w++;
                    else {
                        h=false;
                        break;
                    }
                }
                if(m>0 && e>0 && o>0 && w>0 && h){
                for(int i=0 ; i<n-1 ; i++)
                {
                    if(s.charAt(i)=='m' || s.charAt(i)=='M')
                    {
                        if(s.charAt(i+1)!='e'&& s.charAt(i+1)!='E' && s.charAt(i+1)!='m' && s.charAt(i+1)!='M')
                        {
                            System.out.println("NO");
                            f=false;
                            break;
                        }
                    }
                    else if(s.charAt(i)=='e' || s.charAt(i)=='E')
                    {
                        if(s.charAt(i+1)!='o'&& s.charAt(i+1)!='O' && s.charAt(i+1)!='e' && s.charAt(i+1)!='E')
                        {
                            System.out.println("NO");
                            f=false;
                            break;
                        }
                    }
                    else if(s.charAt(i)=='o' || s.charAt(i)=='O')
                    {
                        if(s.charAt(i+1)!='w'&& s.charAt(i+1)!='W' && s.charAt(i+1)!='o' && s.charAt(i+1)!='O')
                        {
                            System.out.println("NO");
                            f=false;
                            break;
                        }
                    }
                    else if(s.charAt(i)=='w' || s.charAt(i)=='W')
                    {
                        if(s.charAt(i+1)!='w'&& s.charAt(i+1)!='W' )
                        {
                            System.out.println("NO");
                            f=false;
                            break;
                        }
                    }
                    else{
                      System.out.println("NO");
                        f=false;
                    }
                }
                if(f&& (s.charAt(n-1)=='w'|| s.charAt(n-1)=='W')) System.out.println("YES");
            }
            else System.out.println("NO");
            }
        }
    }
}
