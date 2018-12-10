import java.util.Arrays;
import java.util.List;

public class AnimalApplication {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommi");
        dog.talk();

        Cat cat = new Cat("Mia");
        cat.talk();

        Bird bird = new Bird("Tweety");
        bird.fly();

        List<Animal> animals = Arrays.asList(dog, cat, bird);

        Fish fish = new Fish("Nemo");
//        fish.talk();

//        Animal animal = new Animal("T-rex");
//        Talkative talkative = new Talkative();
    }
}
