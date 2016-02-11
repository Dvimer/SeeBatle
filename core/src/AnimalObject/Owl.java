package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Owl extends Animal implements TheeAppble{


    public Owl(String name) {
        this.classAnimal = "Сова";
        this.name = name;
    }

    @Override
    public void toClimbThree() {

    }
}
