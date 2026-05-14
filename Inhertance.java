class Animal {
    void eat() {
        System.out.println("Animal is eating"); //important point is cyclic inheritance is not possible in java
                                                    // class A extends B and class B extends A is not possible in java
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}
public class Inhertance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        Animal a1 = new Animal();
        a1.eat();
    }
}