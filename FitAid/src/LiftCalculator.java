package src;
public class LiftCalculator {

    public static double calculateBenchMax(int weight, int reps) {
        return weight * (1 + ((double) reps / 30));
    }

    public static double calculateSquatMax(int weight, int reps) {
        return weight * (1 + ((double) reps / 30));
    }

    public static double calculateDeadliftMax(int weight, int reps) {
        return weight * (1 + ((double) reps / 30));
    }
    
}
