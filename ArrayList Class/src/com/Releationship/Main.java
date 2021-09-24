package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Brian");
        names.add("Ross");
        names.add("Steve");
        names.add("Rachel");
        names.add("Steve");

        //Checking whether any element is present or not
        if (names.isEmpty()) {
            System.out.println("No names are present!!");
        }

        //Displaying the number of names
        System.out.println("Number Of names: " + names.size());

        //Creating newNames list
        List<String> newNames = new ArrayList<String>();
        newNames.add("Emily");
        newNames.add("Melissa");

        // Adding elements of newNames list into names
        names.addAll(newNames);

        //Displaying all names
        System.out.println("The list of names after adding all the names from newNames to names: ");
        System.out.println("========================================");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("========================================");

        // Checking whether the name Ross is present or not
        if (names.contains("Ross")) {
            System.out.println("This name is already present!");
        } else {
            System.out.println("This name is not present!");
        }

        //Converting list to array
        Object[] namesArray = names.toArray();

        // Deleting all the names from the names list
        //names.clear();
        System.out.println("========================================");
        System.out.println("Checking whether the names list is empty or not : ");
        //Confirming whether all the elements are deleted or not
        System.out.println(names.isEmpty());

        System.out.println("===========================================");
        System.out.println("The names present are :- ");
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }
        System.out.println("===========================================");

        System.out.println("Names through Iterator :- ");
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("===========================================");

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1001, "Steve", true));
        students.add(new Student(1002, "Rachel", false));
        students.add(new Student(1003, "Monica", true));
        students.add(new Student(1004, "David", true));

        List<String> studentNames = new ArrayList<String>();
        for (Student student : students) {
            studentNames.add(student.getStudentName());
            System.out.println("Student Id: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Course Registered: " + student.getCourseRegistered());
        }
        System.out.println("===========================================");
        System.out.println("Student Names: " + studentNames);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        // Looping ArrayList using listIterator()
        ListIterator<Integer> item = numbers.listIterator();
        System.out.println("Displaying numbers...");
        while (item.hasNext()) {
            System.out.println(item.next());
        }
        System.out.println("Display numbers in the reverse order");
        while (item.hasPrevious()) {
            System.out.println(item.previous());
        }
    }
}
