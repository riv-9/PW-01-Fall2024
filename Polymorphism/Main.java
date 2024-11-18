//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Cat c1 = new Cat();
    Animal a1 = new Animal("general");
    Dog d1 = new Dog();
    Dog d2 = new Dog();

    a1.getType();
    c1.getType();

    Animal c2 = new Cat();
    c2.getType();

        System.out.println(Animal.totalAnimalCount);
        System.out.println(Cat.totalAnimalCount);
        System.out.println(Cat.KINGDOM);
        System.out.println(Dog.count);
        d1.eat();
    }
}