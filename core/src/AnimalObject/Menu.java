package AnimalObject;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Menu {
    public static void main(String[] args) {

        Animal[] amimal = new Animal[4];
        amimal[0] = new Dog("Барбос");
        amimal[1] = new Cat("Мурка");
        amimal[2] = new Duck("Селезенка");
        amimal[3] = new Owl("Слепочка");
        Three three = new Three();
        three.setCurrentAnimal(new Owl("Васька"));
        three.setCurrentAnimal(new Cat("Васька"));

        for (Animal animal : amimal) {
            System.out.println(animal.classAnimal  + " по имени " +  animal.name);
        }


    }
}
