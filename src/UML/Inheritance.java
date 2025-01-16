package UML;

class Animal {
    public void eat(){
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("This dog is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
