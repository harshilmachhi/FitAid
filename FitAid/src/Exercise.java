package src;

import java.util.List;

public class Exercise {
    private String name;
    private List<Set> sets;

    public Exercise(String name, List<Set> sets) {
        this.name = name;
        this.sets = sets;
    }

    public List<Set> getSets() {
        return sets;
    }    
    
    public String getName() {
        return name;
    }
}
