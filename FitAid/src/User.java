package src;

public class User {
    private String name;
    private double benchMax;
    private double squatMax;
    private double deadliftMax;

    public User(String name, double benchMax, double squatMax, double deadliftMax) {
        this.name = name;
        this.benchMax = benchMax;
        this.squatMax = squatMax;
        this.deadliftMax = deadliftMax;
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
