
package BTTKKTVER5;

import java.text.*;
import java.util.*;


class PersonList {
    private ArrayList<Person> personItem;
    Scanner keyboard = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    public PersonList() {
        this.personItem = new ArrayList<>();
    }
    public void AddStudent(Student students) {
        personItem.add(students);
        System.out.println("Student Add: " + students.getFullName());
    }
    public void AddTeacher(Teacher teachers) {
        personItem.add(teachers);
        System.out.println("Teacher Add: " + teachers.getFullName());
    }
    public void UpdatePersonById() throws ParseException{
        System.out.println("Enter PersonID Need Update:");
        String ID = keyboard.nextLine();
        Person personToUpdate = null;
        for(Person person : personItem){
            if(person.getId().equals(ID)){
                personToUpdate = person;
                break;
            }
        }
        if(personToUpdate!=null){
            System.out.println("Enter new Full name:");
            String fullName = keyboard.nextLine();
            System.out.println("new DateOfBirth:");
            String dob = keyboard.nextLine();
            Date dateOfBirth = dateFormat.parse(dob);
            personToUpdate.setFullName(fullName);
            personToUpdate.setDateOfBirth(dateOfBirth);
            if(personToUpdate instanceof Student){
                System.out.println("Enter the new GPA:");
                float gpa = keyboard.nextFloat();
                keyboard.nextLine();
                System.out.println("Enter new Major:");
                String major = keyboard.nextLine();
                Student student = (Student) personToUpdate;
                student.setGpa(gpa);
                student.setMajor(major);
                System.out.println("Update Succesful!!!");
            } else if (personToUpdate instanceof Teacher){
                System.out.println("Enter the new department:");
                String department = keyboard.nextLine();
                System.out.println("new TeachingSubjet:");
                String teachingSubject = keyboard.nextLine();
                Teacher teacher = (Teacher) personToUpdate;
                teacher.setDepartment(department);
                teacher.setTeachingSubject(teachingSubject);
                System.out.println("Update Succesful!!!");
            } else {
                System.out.println("Person with ID:"+ID+"not found.");
            }
        }
    }
    public void DeletePersonById(String iD) {
        personItem.removeIf(person -> person.getId().equals(iD));
        System.out.println("Deleted person with ID: " + iD);
    }
    public Person FindPersonById(String iD) {
        for (Person person : personItem) {
            if (person.getId().equals(iD)) {
                return person;
            }
        }
        return null;
    }
    public void DisplayEveryone() {
        for (Person person : personItem) {
            person.DisplayInfo();
        }
    }
    public Student FindTopStudent() {
        Student TopStudent = null;
        for (Person person : personItem) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (TopStudent == null || student.getGpa() > TopStudent.getGpa()) {
                    TopStudent = student;
                }
            }
        }
        return TopStudent;
    }
    public Teacher FindTeacherByDepartment(String Department) {
        for (Person person : personItem) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(Department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
    public void CheckBookBorrowing() {
        for (Person person : personItem) {
            if (person.IsBookOverdue()) {
                System.out.println(person.getFullName() + ": Overding");
            } else {
                System.out.println(person.getFullName() + ": No overding");
            }
        }
    }
}
