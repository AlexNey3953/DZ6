package DZ.Zoo;

public class Cat extends Animals {

    private static int count;

    public Cat(String name){

        super(name);

        super.limitSwim = 0;
        super.limitWalk = 200;

        count++;

    }

    public static int getCount(){

        return count;

    }

    @Override
    public void swim(int distance){

        System.out.printf("Cat not swim!\n");

    }

}
