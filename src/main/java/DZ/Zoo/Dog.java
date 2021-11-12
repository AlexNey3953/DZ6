package DZ.Zoo;

public class Dog extends Animals{

    private static int count;

    public Dog(String name){

        super(name);

        super.limitSwim = 10;
        super.limitWalk = 500;

        count++;

    }

    public static int getCount(){

        return count;

    }

}
