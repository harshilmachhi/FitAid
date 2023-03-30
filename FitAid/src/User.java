package src;

public class User {
    private String name;
    private double benchMax;
    private double squatMax;
    private double deadliftMax;
    private int age;
    private double weight;

    public User(String name, double benchMax, double squatMax, double deadliftMax) {
        this.name = name;
        this.benchMax = benchMax;
        this.squatMax = squatMax;
        this.deadliftMax = deadliftMax;
        //this.age = age;
        //this.weight = weight;
    }

    public int getUserAge() {
        return age;
    }

    public double getUserWeigth() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getBenchMax() {
        return benchMax;
    }

    public double getSquatMax() {
        return squatMax;
    }

    public double getDeadliftMax() {
        return deadliftMax;
    }
}
