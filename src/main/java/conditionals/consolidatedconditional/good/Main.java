package main.java.conditionals.consolidatedconditional.good;

public class Main {
	
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if (!isEligibleExtraSalary())
            return 0;


        // Calculate extra salary:
        // ...

        return result;

    }
    private boolean isEligibleExtraSalary(){
        boolean category = seniority < 1 || education < 1;
        boolean experience = incidents > 10 || !certification;
        return category || experience;
    }

}
