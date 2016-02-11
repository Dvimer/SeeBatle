package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Cat extends Animal implements TheeAppble{

    protected String classAnimal = this.name;

    public Cat(String name) {
        this.classAnimal = "Кошка";
        this.name = name;
    }

    @Override
    public void toClimbThree() {
        System.out.println("забирается на дерево");
    }
}
