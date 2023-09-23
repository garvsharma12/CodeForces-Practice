import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int[] arr = new int[26];
        for(int i=0 ; i<str.length() ; i++)
            arr[str.charAt(i)-'A']++;
        
        if(len%2==1)
        {
            int c_odd=0 , odd=0 , c=0;
            for(int i=0 ; i<arr.length ; i++)
            {
                if(arr[i]%2==1)
                {
                    c_odd=i;
                    c=arr[i];
                }
                if(arr[i]%2==1)
                    odd++;
            }
            if((odd>1))
            {
                System.out.println("NO SOLUTION");
            }
            else 
            {
                String s ="",temp="" , var="",output="";
                temp=""+(char)(c_odd+'A');
                temp=temp.repeat(c);
                s+=temp;
                for(int i=0 ; i<arr.length ; i++)
                {
                    if((arr[i]%2==0)&&(arr[i]!=0))
                    {
                        temp=""+(char)(i+'A');
                        temp=temp.repeat(arr[i]/2);
                        var+=temp;

                    }
                }
                output+=s;
                
                StringBuilder input1 = new StringBuilder();
                input1.append(var);
                input1.reverse();
                var+=output;
                var+=input1;
                System.out.println(var);
            }
        }
        else 
        {
            boolean b = true;
            for(int i=0 ; i<arr.length ; i++)
            {
                if(arr[i]%2==1)
                {
                    System.out.println("NO SOLUTION");
                    b=false;
                    break;
                }
            }
            if(b)
            {
                String s ="",temp="";
                for(int i=0 ; i<arr.length ; i++)
                {
                    if((arr[i]!=0))
                    {
                        temp=""+(char)(i+'A');
                        temp=temp.repeat(arr[i]/2);
                        s+=temp;

                    }
                }
                StringBuilder input1 = new StringBuilder();
                input1.append(s);
                input1.reverse();
                s+=input1;
                System.out.println(s);
            }
            
        }

        sc.close();
    }
}
