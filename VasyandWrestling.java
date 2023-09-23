import java.util.ArrayList;
import java.util.Scanner;

public class VasyandWrestling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        long first =0 , last=0;
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        int temp = 0 , t=0;

        while(tt-->0){
             t = sc.nextInt();
            if(t<0){ last+=t; ar2.add(t);}
            else {first+=t; ar1.add(t);}
        }
        boolean b = true;
        temp=t;
        if(first>(-last)) {
            System.out.println("first");
        }
        else if(first<(-last)) System.out.println("second");
        else{
            int sz1 = ar1.size() ,sz2= ar2.size();
            int req = Math.min(sz1 , sz2);
            for(int i=0 ; i< req ; i++){
                if(ar1.get(i)>(-ar2.get(i))) {
                    System.out.println("first");
                    b=false;
                    break;
                }
                else if(ar1.get(i)<(-ar2.get(i))){
                    System.out.println("second");
                    b=false;
                    break;
                }
                /*else if(first==(-last)){
                    if(temp<0) System.out.println("second");
                    else System.out.println("first");
                    //System.out.println(temp);
                    b=false;
                    break;
                }*/
            }
            if(first==(-last)&&b){
                if(temp<0) System.out.println("second");
                else System.out.println("first");}
        }
    }
}
