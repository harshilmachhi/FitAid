package src;

import java.util.List;
import java.util.ArrayList;

public class FitAid {


    public static void main (String[] args) {

        System.out.println("Enter your name: ");
        String name = StdIn.readString();

        System.out.println("Hello " + name + ", welcome to FitAid. To get started, type start: ");

        

        String input = "";

        while(true) {
            input = StdIn.readString();
            if(input.equalsIgnoreCase("start") ) {
                break;
            }
            System.out.println("Invalid input, please enter weight for Bench, Squat, and Deadlift:");
        }

        System.out.println("Select an option: ");
        System.out.println("1. 1RM Calculator");
        System.out.println("2. Training Programs");

        int menuOption = StdIn.readInt();

        if(menuOption == 1) {
            double benchMax = calculateMax("Bench", true);
            double squatMax = calculateMax("Squat", true);
            double deadliftMax = calculateMax("Deadlift", true);   

            User user = new User(name, benchMax, squatMax, deadliftMax);

        } else if (menuOption == 2) {
            System.out.println("What are you training for?");

        System.out.println("1. Strength");
        System.out.println("2. Hypertrophy (To be added)");



        int choice = StdIn.readInt();

        if(choice == 1) {

            System.out.println("Choose a program: ");
            System.out.println("1. Wendler's 5/3/1");
            System.out.println("2. Ultimate Bench Program");

            int programOption = StdIn.readInt();

            if (programOption == 1) {

                double benchMax = calculateMax("Bench", true);
                double squatMax = calculateMax("Squat", true);
                double deadliftMax = calculateMax("Deadlift", true);        
        
                User user = new User(name, benchMax, squatMax, deadliftMax);
        
                List<Exercise> wendRoutine = Wendler531.generateStrengthWorkoutRoutine(user);
                
        
                int space = 5;
        
                for(int i = 0; i < space; i++) {
                    System.out.println("");
        
                }
        
                System.out.println("----------------->Wendler's 5/3/1 Strength Training Program<-----------------");
        
                for(int i = 0; i < space; i++) {
                    System.out.println("");
        
                }
        
                for(Exercise exercise : wendRoutine) {
                    System.out.println(exercise.getName() + ":");
                    for(Set set : exercise.getSets()) {
                        System.out.println(set.getWeight() + " lbs x " + set.getReps());
                    }
                    System.out.println("");
                }
        
            }

            if(programOption == 2) {

                double benchMax = calculateMax("Bench", true);
                double squatMax = 0.0;
                double deadliftMax = 0.0;
        
      
        
                User user = new User(name, benchMax, squatMax, deadliftMax);


                List<Exercise> benchRoutine = Bench.generateBenchRoutine(user);

                int space = 5;
        
                for(int i = 0; i < space; i++) {
                    System.out.println("");
        
                }
        
                System.out.println("----------------->Ultimate Bench Strength Training Program<-----------------");
        
                for(int i = 0; i < space; i++) {
                    System.out.println("");
        
                }
        
                for(Exercise exercise : benchRoutine) {
                    System.out.println(exercise.getName() + ":");

                    Set firstSet = exercise.getSets().get(0);
                    System.out.println(firstSet.getWeight() + " lbs : " + exercise.getSets().size() + "x" + firstSet.getReps());
                    System.out.println("");

                }

            }
        }
        }

        
    }
    




    public static double calculateMax(String lift, boolean calculateMax) {
        if (!calculateMax) {
            return 0;
        }
    
        int weight = 0;
        int reps = 0;
        System.out.println("Enter weight for " + lift + ":");
        weight = StdIn.readInt();
        System.out.println("Enter reps:");
        reps = StdIn.readInt();
    
        double max = 0;
        switch (lift.toLowerCase()) {

            case "bench":
                max = LiftCalculator.calculateBenchMax(weight, reps);
                break;
            case "squat":
                max = LiftCalculator.calculateSquatMax(weight, reps);
                break;
            case "deadlift":
                max = LiftCalculator.calculateDeadliftMax(weight, reps);
                break;
        }
    
        System.out.println("One-rep max for " + lift + " is " + max);
        return max;
    }
}