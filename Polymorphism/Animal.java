public class Animal implements AnimalBehavior {


    String type;
    static int totalAnimalCount;
    public static final String KINGDOM = "Animalia";

    public Animal(String type) {
        this.type = type;
        totalAnimalCount++;
    }

    public void getType(){
        System.out.println(type);
    }

    public void eat(){
        System.out.println("Animal eats");
    }
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
