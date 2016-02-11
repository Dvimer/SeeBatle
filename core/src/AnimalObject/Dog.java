package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Dog extends Animal implements Swimable {



    public Dog(String name) {
        this.classAnimal = "Собака";
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Летает");
    }
}
