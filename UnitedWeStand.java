import java.util.*;
public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> user = new ArrayList<>();
            for(int i=0 ;i<n ; i++)
                user.add(sc.nextInt());

            int mx = Collections.max(user);
            //b.add(mx);
            for(int i=0 ; i<n ;i++){
                int l = user.get(i);
                if(l==mx) b.add(l);
                else a.add(l);
            }
            if(a.size()==0 || b.size()==0) System.out.println(-1);
            else{
               System.out.println(a.size()+" "+b.size());
               for(int i=0 ; i<a.size() ; i++){
                    System.out.print(a.get(i)+" ");
               } 
               System.out.println();

               for(int i=0 ; i<b.size() ; i++){
                    System.out.print(b.get(i)+" ");
               }
               System.out.println();
            }
        }
    }
}
