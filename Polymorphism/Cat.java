public class Cat extends Animal {

    static int count;
    public Cat() {
        super("Cat");
        count++;
    }

    public void eat() {
        System.out.println("Cat is eating");
    }


}
