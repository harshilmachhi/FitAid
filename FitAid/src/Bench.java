package src;

import java.util.List;
import java.util.ArrayList;

public class Bench {

    private static final int WEEKS = 3;
    private static final int DAYS = 4;


    public static List<Exercise> generateBenchRoutine(User User) {
        List<Exercise> routine = new ArrayList<>();

        double benchTrainingMax = Math.round(User.getBenchMax());

        for (int i = 0; i < WEEKS; i++) {
    
            for (int j = 0; j < DAYS; j++) {
                
                String exerciseName = "Week " + (i+1) + " Day " + (j+1) + " - Bench Press";
                List<Set> setsAndReps = generateSetsReps(benchTrainingMax, i, j);
                routine.add(new Exercise(exerciseName, setsAndReps));

        }

    }
    return routine;


    }

    private static List<Set> generateSetsReps(double benchTrainingMax, int week, int days) {
        List<Set> sets = new ArrayList<>();
    
        if (week == 0) {
            
            if(days == 0) {
            double percentages = .70;
            int reps = 6;

            for(int i = 0; i < reps; i++) {
                sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));
            }

            } else if(days == 1) {
                double percentages = .75;
                int reps = 5;                

                for(int i = 0; i < reps+2; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                } 
            } else if (days == 2) {
                double percentages = .80;
                int reps = 4;

                for(int i = 0; i < reps+4; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
                
            } else if (days == 3) {
                double percentages = .85;
                int reps = 3;

                for(int i = 0; i < reps + 7; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
            } 
        } else if (week == 1) {
            if(days == 0) {
            double percentages = .70 * 1.07;
            int reps = 6;

            for(int i = 0; i < reps; i++) {
                sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));
            }

            } else if(days == 1) {
                double percentages = .75 * 1.07;
                int reps = 5;                

                for(int i = 0; i < reps+2; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                } 
            } else if (days == 2) {
                double percentages = .80 * 1.07;
                int reps = 4;

                for(int i = 0; i < reps+4; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
                
            } else if (days == 3) {
                double percentages = .85 *1.07;
                int reps = 3;

                for(int i = 0; i < reps + 7; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
            } 
        } else if (week == 2) {
            if(days == 0) {
            double percentages = .70 * 1.145;
            int reps = 6;

            for(int i = 0; i < reps; i++) {
                sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));
            }

            } else if(days == 1) {
                double percentages = .75 * 1.145;
                int reps = 5;                

                for(int i = 0; i < reps+2; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                } 
            } else if (days == 2) {
                double percentages = .80 * 1.14;
                int reps = 4;

                for(int i = 0; i < reps+4; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
                
            } else if (days == 3) {
                double percentages = .85 * 1.13;
                int reps = 3;

                for(int i = 0; i < reps + 7; i++) {
                    sets.add(new Set((int) Math.round(benchTrainingMax * percentages), reps));                
                }
            } 
        }

        return sets;
    }

}
