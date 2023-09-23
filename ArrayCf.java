import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayCf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a0 = new ArrayList<>();
        List<Integer> aN = new ArrayList<>();
        List<Integer> aP = new ArrayList<>();
        for(int i=0 ;i<n ; i++){
            int k=sc.nextInt();
            if(k==0) a0.add(k);
            else if(k>0) aP.add(k);
            else aN.add(k);
        }
        if(aP.size()==0){
            aP.add(aN.get(aN.size()-1));
            aN.remove(aN.get(aN.size()-1));
            aP.add(aN.get(aN.size()-1));
            aN.remove(aN.get(aN.size()-1));
        }
        if(aN.size()%2==0){
            a0.add(aN.get(aN.size()-1));
            aN.remove(aN.get(aN.size()-1));
        }
        System.out.print(aN.size()+" "); for(int i=0 ;i<aN.size() ; i++){ System.out.print(aN.get(i)+" ");} System.out.println();
        System.out.print(aP.size()+" "); for(int i=0 ;i<aP.size() ; i++){ System.out.print(aP.get(i)+" ");} System.out.println();
        System.out.print(a0.size()+" "); for(int i=0 ;i<a0.size() ; i++){ System.out.print(a0.get(i)+" ");} System.out.println();
    }
}
