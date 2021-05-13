package ro.fasttrackit.curs13.exceptions.exercises.birth;

public class Main {
    public static void main(String[] args) {
        BirthYearCalculator yearCalculator = new BirthYearCalculator();
        try {
            System.out.println(yearCalculator.calculateYear(10));
        } catch (InvalidAgeException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println(yearCalculator.calculateYear(-10));
            System.out.println(yearCalculator.calculateYear(50));
        } catch (InvalidAgeException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println(yearCalculator.calculateYear(30));
        } catch (InvalidAgeException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
