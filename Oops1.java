class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
    void eat(){
        System.out.println("Dog Is Eating");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
public class Oops1{
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Animal obj3 = new Dog();
        obj3.eat();
        obj3=new Cat();
        obj3.eat();
        Cat obj2 = new Cat();
        obj1.eat();
        obj2.meow();
    }
}
