/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTKKTVER5;

import java.text.*;
import java.util.*;
public class Processor {
    public static void main(String[] args) throws ParseException {
        PersonList personItem = new PersonList();
        Scanner Scannerr = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        while (true) {
            System.out.println("1. Add New Student");
            System.out.println("2. Add New Teacher");
            System.out.println("3. Update Person By ID");
            System.out.println("4. Delete Person By ID");
            System.out.println("5. Display All Students And Teachers");
            System.out.println("6. Find Student With Highest GPA");
            System.out.println("7. Find Teachers By Department");
            System.out.println("8. Check Book Borrowing Status");
            System.out.println("9. Exit ( Out )");
            int chosse = Scannerr.nextInt();
            Scannerr.nextLine(); 
            switch (chosse) {
                case 1:
                    System.out.println("Enter student ID:");
                    String StudentId = Scannerr.nextLine();
                    System.out.println("Enter student name:");
                    String StudentName = Scannerr.nextLine();
                    System.out.println("DateOfBirth:");
                    String Dob = Scannerr.nextLine();
                    Date dateOfBirth = dateFormat.parse(Dob);
                    System.out.println("Enter GPA:");
                    float Gpa = Scannerr.nextFloat();
                    Scannerr.nextLine(); 
                    System.out.println("Enter major:");
                    String Major = Scannerr.nextLine();
                    Date borrowDate = new Date();
                    Date returnDate = new Date(borrowDate.getTime() + (31L * 24 * 60 * 60 * 1000)); // Simulate 31 days later
                    Student student = new Student(StudentId, StudentName, new Date(), borrowDate, returnDate, Gpa, Major);
                    personItem.AddStudent(student);
                    break;
                case 2:
                    System.out.println("Enter teacher ID:");
                    String TeacherId = Scannerr.nextLine();
                    System.out.println("Enter teacher name:");
                    String TeacherName = Scannerr.nextLine();
                    System.out.println("Enter department:");
                    String Department = Scannerr.nextLine();
                    System.out.println("Enter teaching subject:");
                    String Subject = Scannerr.nextLine();
                    Teacher Teacherr = new Teacher(TeacherId, TeacherName, new Date(), new Date(), new Date(), Department, Subject);
                    personItem.AddTeacher(Teacherr);
                    break;
                case 3:
                    personItem.UpdatePersonById();
                    break;
                case 4:
                    System.out.println("Enter person ID to delete:");
                    String idToDelete = Scannerr.nextLine();
                    personItem.DeletePersonById(idToDelete);
                    break;
                case 5:
                    personItem.DisplayEveryone();
                    break;
                case 6:
                    Student TopStudent = personItem.FindTopStudent();
                    if (TopStudent != null) {
                        System.out.println("Student with highest GPA:");
                        TopStudent.DisplayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 7:
                    System.out.println("Enter department:");
                    String deps = Scannerr.nextLine();
                    Teacher teacherByDep = personItem.FindTeacherByDepartment(deps);
                    if (teacherByDep != null) {
                        teacherByDep.DisplayInfo();
                    } else {
                        System.out.println("No teacher found in department: " + deps);
                    }
                    break;
                case 8:
                    personItem.CheckBookBorrowing();
                    break;

                case 9:
                    System.out.println("Exiting program.");
                    Scannerr.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}