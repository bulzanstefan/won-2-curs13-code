package ro.fasttrackit.curs13.exceptions.exercises.birth;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Age " + age + " is invalid");
    }
}
