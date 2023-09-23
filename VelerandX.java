import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class VelerandX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Character> set1 = new HashSet(); 
        HashSet<Character> set2 = new HashSet();
        int k=n-1;
        sc.nextLine();
        for(int i=0 ;i<n ; i++){
            String s = sc.nextLine();
            for(int j=0 ; j<n ; j++){
                if (j==k){
                    set1.add(s.charAt(k)); k--;
                }
                else if(i==j) set1.add(s.charAt(j));
                else set2.add(s.charAt(j));
            }
        }
       // System.out.println(set1.size()+" "+set2.size());
        if((set1.size()!=1 || set2.size()!=1)){
            System.out.println("NO");
        }
        else{
        char c1='a' , c2='b';
        Iterator<Character> itr=set1.iterator();    
        while(itr.hasNext()){    
           c1=itr.next();    
        }    

        Iterator<Character> itr2 =set2.iterator();    
        while(itr2.hasNext()){    
           c2=itr2.next();    
        }
        //System.out.println(c1+" "+c2);
        if(c1==c2) System.out.println("NO");
        else System.out.println("YES");
        
    }

    }
}
