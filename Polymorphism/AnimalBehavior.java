public interface AnimalBehavior {

    int MAX_AGE = 100;

    void eat();
    default void move(){
        System.out.println("it moves");
    };
    void sound();
}
