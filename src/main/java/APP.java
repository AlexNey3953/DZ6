import DZ.Zoo.Animals;
import DZ.Zoo.Cat;
import DZ.Zoo.Dog;

public class APP {

    public static void main(String[] args) {

        Cat catMyrka = new Cat("Myrka");

        Cat catKati = new Cat("Kati");

        Cat catLusi = new Cat("Lusi");

        Dog dogBarbos = new Dog("Barbos");

        System.out.println(catMyrka.getName());

        catMyrka.walk(100);
        catMyrka.walk(150);
        catMyrka.walk(200);
        catMyrka.walk(201);

        catMyrka.swim(100);

        dogBarbos.swim(5);
        dogBarbos.swim(10);
        dogBarbos.swim(11);

        dogBarbos.walk(100);
        dogBarbos.walk(150);
        dogBarbos.walk(500);
        dogBarbos.walk(501);

        catLusi.walk(100);
        catKati.walk(100);

        System.out.println("Count cat: " + Cat.getCount());
        System.out.println("Count dog: " + Dog.getCount());
        System.out.println("Count Animal: " + Animals.getCount());


    }
}
