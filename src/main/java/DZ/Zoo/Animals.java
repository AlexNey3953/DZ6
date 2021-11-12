package DZ.Zoo;

public class Animals {

    protected String name;

    protected int limitWalk;
    protected int limitSwim;

    private static int count;

    public Animals(String name){

        this.name = name;

        count++;

    }

    public void walk(int distance){

        if (this.limitWalk >= distance) System.out.printf("%s walk: %s\n", this.name, distance);
        else System.out.printf("%s walk: %s and fell! Limit %s\n", this.name, distance, this.limitWalk);



    }

    public void swim(int distance){

        if (this.limitSwim >= distance) System.out.printf("%s walk: %s\n", this.name, distance);
        else System.out.printf("%s swim: %s and drowned! Limit %s\n", this.name, distance, this.limitSwim);

    }

    public String getName(){

        return name;

    }

    public static int getCount(){

        return count;

    }

}
