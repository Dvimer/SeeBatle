package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public abstract class Animal {
    protected String classAnimal;
    protected String name;


    public Animal() {
    }

    public Animal(String name, String classAnimal) {
        this.name = name;
        this.classAnimal = classAnimal;
    }
}
