package ro.fasttrackit.curs13.homework;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Ioana", 7);
        students.put("Darius", 5);
        students.put("Mihai", 3);

        printStudents(students);
        String bestStudent = findBestStudent(students);
        System.out.println(bestStudent);
    }

    private static String findBestStudent(Map<String, Integer> students) {
        int max = 0;
        String maxStudent = "";
        anotherOne();
        for (String name : students.keySet()) {
            Integer nota = students.get(name);
            if (nota > max) {
                max = nota;
                maxStudent = name;
            }
        }
        return maxStudent;
    }

    private static void anotherOne() {
        extracted();
    }

    private static void extracted() {
        extracted2();
    }

    private static void extracted2() {
        System.out.println("EXTRACTED2 -BEFORE");
        new Person("", 2, Hair.BLACK).show();
        System.out.println("EXTRACTED2 -AFTER");
        int[] arr = new int[3];
        System.out.println(arr[6]);
    }

    private static void printStudents(Map<String, Integer> students) {
        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
