class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating dog food");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
    }
}

