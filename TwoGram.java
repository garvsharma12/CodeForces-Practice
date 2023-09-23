import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class TwoGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        if(n%2==0){
            for(int i=0 ;i<=n-2;i++){
                String sub = s.substring(i, i+2);
                if(hs.containsKey(sub)){
                    hs.put(sub, hs.get(sub)+1);
                }
                else 
                    hs.put(sub, 1);
            }
        }
        else{
            for(int i=0 ;i<=n-2;i++){
                String sub = s.substring(i, i+2);
                if(hs.containsKey(sub)){
                    hs.put(sub, hs.get(sub)+1);
                }
                else 
                    hs.put(sub, 1);
            }

            for(int i=1 ;i<=n-2;i++){
                String sub = s.substring(i, i+2);
                if(hs.containsKey(sub)){
                    hs.put(sub, hs.get(sub)+1);
                }
                else 
                    hs.put(sub, 1);
            }
        }
        String out="";
        int mx = Collections.max(hs.values());
        for(Entry<String,Integer> entry: hs.entrySet()){
            if(entry.getValue()==mx)
                out=entry.getKey();
        }
        System.out.println(out);
    }
}
