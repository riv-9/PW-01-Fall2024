public class prac {
public static void main(String[] args) {


    Dog d = new Dog("H");
    d.move();
    d.makeSound();
}
}

abstract class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}

interface Moveable{
    void move();
}

class Dog extends Animal implements Moveable{
    public Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("Dog makeSound");
    }
    public void move(){
        System.out.println("Dog Moveable");
    }

}
