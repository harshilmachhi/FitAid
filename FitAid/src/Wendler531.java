package src;

import java.util.ArrayList;
import java.util.List;

public class Wendler531 {

    private static final int WEEKS = 4;

    public static List<Exercise> generateStrengthWorkoutRoutine(User user) {
        List<Exercise> routine = new ArrayList<>();
    
        // Calculate training maxes
        double benchTrainingMax = Math.round(user.getBenchMax());
        double squatTrainingMax = Math.round(user.getSquatMax());
        double deadliftTrainingMax = Math.round(user.getDeadliftMax());
    
        for (int i = 0; i < WEEKS; i++) {
            routine.add(new Exercise("Week " + (i+1) + " - Bench Press", generateSetsReps(benchTrainingMax, i)));
            routine.add(new Exercise("Week " + (i+1) + " - Squat", generateSetsReps(squatTrainingMax, i)));
            routine.add(new Exercise("Week " + (i+1) + " - Deadlift", generateSetsReps(deadliftTrainingMax, i)));
        }
    
        return routine;
    }
    
    private static List<Set> generateSetsReps(double trainingMax, int week) {
        List<Set> sets = new ArrayList<>();
    
        double[] percentages;
        if (week == 0) {
            percentages = new double[]{0.65, 0.75, 0.85};
            int[] reps = new int[]{5, 5, 5};
            sets.add(new Set((int) Math.round(trainingMax * percentages[0]), reps[0]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[1]), reps[1]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[2]), reps[2]));
        } else if (week == 1) {
            percentages = new double[]{0.70, 0.80, 0.90};
            int[] reps = new int[]{3, 3, 3};
            sets.add(new Set((int) Math.round(trainingMax * percentages[0]), reps[0]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[1]), reps[1]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[2]), reps[2]));
        } else if (week == 2) {
            percentages = new double[]{0.75, 0.85, 0.95};
            int[] reps = new int[]{5, 3, 1};
            sets.add(new Set((int) Math.round(trainingMax * percentages[0]), reps[0]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[1]), reps[1]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[2]), reps[2]));
        } else if (week == 3) {
            percentages = new double[]{0.40, 0.50, 0.60};
            int[] reps = new int[]{5, 5, 5};
            sets.add(new Set((int) Math.round(trainingMax * percentages[0]), reps[0]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[1]), reps[1]));
            sets.add(new Set((int) Math.round(trainingMax * percentages[2]), reps[2]));
        } else {
            return sets;
        }
    
        return sets;
    }

}
