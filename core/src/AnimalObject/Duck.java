package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Duck extends Animal implements Swimable {


    public Duck(String name) {
        this.classAnimal = "Утка";
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Летает");
    }
}
