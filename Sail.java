import java.util.Scanner;
public class Sail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int ex = sc.nextInt();
        int ey = sc.nextInt();
        sc.nextLine();
        String dir = sc.nextLine();
        int[] count = new int[4];
        for(int i=0 ; i<t ; i++)
        {
            if(dir.charAt(i)=='E')
                count[0]++;
            else if(dir.charAt(i)=='W')
                count[1]++;
            else if(dir.charAt(i)=='N')
                count[2]++;
            else 
                count[3]++;
        }
        int req1 = ex-sx , req2 = ey-sy;
/*...................................................................................... */

        if((req1==0)&&(req2==0))
            System.out.println(0);

        else if((req1>0)&&(req2>0))
        {
            if((count[0]>=req1)&&(count[2]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if((req1<=0)&&(req2<=0))
                {
                    System.out.println(i);
                    break;
                }
                if(dir.charAt(i)=='E')
                    req1--;
                else if(dir.charAt(i)=='N')
                    req2--;
            }
            if((req2>0)||(req1>0))
                System.out.println(-1);
            }
            else 
            {
                System.out.println(-1);
                
            }
        }

        else if((req1<0)&&(req2<0))
        {
            req1=Math.abs(ex-sx);
            req2=Math.abs(ey-sy);
            if((count[1]>=req1)&&(count[3]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='W')
                    req1--;
                else if(dir.charAt(i)=='S')
                    req2--;

                    if((req1<=0)&&(req2<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if((req2>0)||(req1>0))
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1>0)&&(req2<0))
        {
            req1=Math.abs(ex-sx);
            req2=Math.abs(ey-sy);
            if((count[0]>=req1)&&(count[3]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='E')
                    req1--;
                else if(dir.charAt(i)=='S')
                    req2--;
                    if((req1<=0)&&(req2<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if((req2>0)||(req1>0))
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1<0)&&(req2>0))
        {
            req1=Math.abs(ex-sx);
            req2=Math.abs(ey-sy);
            if((count[1]>=req1)&&(count[2]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='W')
                    req1--;
                else if(dir.charAt(i)=='N')
                    req2--;

                    if((req1<=0)&&(req2<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if((req2>0)||(req1>0))
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1==0)&&(req2>0))
        {
            req2=Math.abs(ey-sy);
            if((count[2]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='N')
                    req2--;
                    if((req2<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if(req2>0)
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1==0)&&(req2<0))
        {
            req2=Math.abs(ey-sy);
            if((count[3]>=req2))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='S')
                    req2--;
                    if((req2<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if(req2>0)
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1>0)&&(req2==0))
        {
            req1=Math.abs(ex-sx);
            if((count[0]>=req1))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='E')
                    req1--;
                    if((req1<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if(req1>0)
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        else if((req1<0)&&(req2==0))
        {
            req1=Math.abs(ex-sx);
            if((count[1]>=req1))
            {
            for(int i=0 ; i<dir.length() ; i++)
            {
                if(dir.charAt(i)=='W')
                    req1--;
                    if((req1<=0))
                    {
                        System.out.println(i+1);
                        break;
                    }
            }
            if(req1>0)
                System.out.println(-1);
        }
        else 
            System.out.println(-1);
        }

        sc.close();
    }
}
