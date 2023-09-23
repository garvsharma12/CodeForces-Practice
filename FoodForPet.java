import java.util.Scanner;

public class FoodForPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =sc.nextInt();
        while(tt-->0){
        int avDog = sc.nextInt();
        int avCat = sc.nextInt();
        int ext = sc.nextInt();
        int dog = sc.nextInt();
        int cat = sc.nextInt();
        if(avCat>=cat && avDog>=dog) System.out.println("YES");
        else if(avCat<cat && avDog<dog){
            cat-=avCat; dog-=avDog;
            if(ext-cat-dog>=0) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(ext-cat-dog);
        }
        else if(avCat>=cat && avDog<dog){
            dog-=avDog;
            if(ext-dog>=0) System.out.println("YES");
            else System.out.println("NO");
        }
        else{
            cat-=avCat;
            if(ext-cat>=0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    }
}
