import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char h='h' , e = 's' , l='s' , L= 's', o='s';

        for(int i=0 ; i<str.length() ; i++)
        {
            if((h=='h')&&(str.charAt(i)=='h'))
            {
                h='s';
                e='e';
            }
            else if((e=='e')&&(str.charAt(i)=='e'))
            {
                e='s';
                l='l';
            }
            else if((l=='l')&&(str.charAt(i)=='l'))
            {
                l='s';
                L='L';
            }
            else if((L=='L')&&(str.charAt(i)=='l'))
            {
                L='s';
                o='o';
            }
            else if((o=='o')&&(str.charAt(i)=='o'))
            {
                o='y';
            }
        }
        if(o=='y')
            System.out.println("YES");
        else 
            System.out.println("NO");
        sc.close();
    }
}
