
package javacode;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find a teacher by department");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student details (ID, Name, DateOfBirth, GPA, Major):");
                    String sId = scanner.nextLine();
                    String sName = scanner.nextLine();
                    String sDoB = scanner.nextLine();
                    float gpa = scanner.nextFloat();
                    scanner.nextLine(); // consume newline
                    String major = scanner.nextLine();
                    personList.addStudent(new Student(sId, sName, sDoB, gpa, major));
                    break;

                case 2:
                    System.out.println("Enter teacher details (ID, Name, DateOfBirth, Department, Subject):");
                    String tId = scanner.nextLine();
                    String tName = scanner.nextLine();
                    String tDoB = scanner.nextLine();
                    String department = scanner.nextLine();
                    String subject = scanner.nextLine();
                    personList.addTeacher(new Teacher(tId, tName, tDoB, department, subject));
                    break;

                case 3:
                    System.out.println("Enter ID of the person to update:");
                    String uId = scanner.nextLine();
                    // Update logic...
                    break;

                case 4:
                    System.out.println("Enter ID of the person to delete:");
                    String dId = scanner.nextLine();
                    personList.deletePersonById(dId);
                    break;

                case 5:
                    System.out.println("Enter ID of the person to find:");
                    String fId = scanner.nextLine();
                    Person person = personList.findPersonById(fId);
                    if (person != null) {
                        person.displayInfo();
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 6:
                    personList.displayEveryone();
                    break;

                case 7:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 8:
                    System.out.println("Enter department:");
                    String dept = scanner.nextLine();
                    Teacher teacher = personList.findTeacherByDepartment(dept);
                    if (teacher != null) {
                        teacher.displayInfo();
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
