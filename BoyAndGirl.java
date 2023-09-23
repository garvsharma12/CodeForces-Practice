import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BoyAndGirl {
    public static void main(String[] args)throws Exception {
        File f = new File("input.txt");
        FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter("output.txt");
        int n=Integer.parseInt(Character.toString(fr.read()));
        int m=Integer.parseInt(Character.toString(fr.read()));
        System.out.println(n+" "+m);
        String s = "";
        if(n==m)
        {
            for(int i=0 ; i<n ; i++)
            {
                s+="G";
                s+="B";
            }
            fw.write(s);
        }
        else if(n>m)
        {
            while(n-->0)
            {
                s+="B";
                if(m!=0)
                {
                    s+="G";
                    m--;
                    continue;
                }
            }
            fw.write(s);
        }
        else if(m>n)
        {
            while(m-->0)
            {
                s+="G";
                if(n!=0)
                {
                    s+="B";
                    n--;
                    continue;
                }
            }
            fw.write(s);
        }
        System.out.println(s);

        fw.close();
        fr.close();
    }
}
