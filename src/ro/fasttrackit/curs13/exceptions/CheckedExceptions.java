package ro.fasttrackit.curs13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//CATCH OR SPECIFY
public class CheckedExceptions {
    public static void main(String[] args) throws Exception {
        printNames();
        try {
            printNamesThrows();
        } catch (Exception ex) {
            System.out.println("nothin");
        }
        throwMyException();
    }

    private static void throwMyException() throws MyException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new MyException("This is Spartaaaa!");
        }
    }

    private static void printNamesThrows() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/tmp/test.txt2"));
        String s = scanner.nextLine();
        System.out.println("The name is " + s);
    }

    private static void printNames() {
        try {
//            String a = null;
//            int length = a.length();

            Scanner scanner = new Scanner(new File("/tmp/test.txt2"));
            String s = scanner.nextLine();
            System.out.println("The name is " + s);
        } catch (NullPointerException | IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("it's null or IO");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
