public class Dog extends Animal {

    static int count;
    public Dog() {
        super("Dog");
        count++;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }


}
