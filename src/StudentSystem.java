package StudentManagementSystem.src;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private ArrayList<StudentDetails> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public StudentDetails findStudent(int id){
        for(StudentDetails student : students){
            if(student.getId() == id){
                return student; 
            }
        }
        return null;
    }

    public void addStudent(){

        System.out.println("Enter Student ID : ");
        int id;
        try{
            id = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        if(findStudent(id) != null){
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        if(name.trim().isEmpty()){
            System.out.println("Name cannot be null!");
            return;
        }

        System.out.println("Enter Age : ");
        int age; 
        try{
            age = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        if(age <= 0){
            System.out.println("Age must be positive!");
            return;
        }
        
        System.out.println("Enter Course : ");
        String course = sc.nextLine();
        if(course.trim().isEmpty()){
            System.out.println("Course cannot be null!");
            return;
        }
        
        System.out.println("Enter Marks : ");
        double marks;
        try{
            marks = Double.parseDouble(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        if(marks < 0 || marks > 100){
            System.out.println("Marks must be between 0 and 100!");
            return;
        }

        StudentDetails student = new StudentDetails(id, name, age, course, marks);
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void deleteStudent(){
        System.out.println("Enter Student ID : ");
        int id;
        try{
            id = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }

        StudentDetails student = findStudent(id);
        if(student == null){
            System.out.println("Student not found!");
            return;
        }

        students.remove(student);
        System.out.println("Student Deleted Successfully!");
    }

    public void updateStudent(){
        System.out.println("Enter Student ID : ");
        int id;
        try{
            id = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        StudentDetails student = findStudent(id);

        if(student == null){
            System.out.println("Student not found!");
            return;
        }

        System.out.println("Enter new Name : ");
        String name = sc.nextLine();
        if(name.trim().isEmpty()){
            System.out.println("Name cannot be null!");
            return;
        }

        System.out.println("Enter new Age : ");
        int age; 
        try{
            age = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        if(age <= 0){
            System.out.println("Age must be positive!");
            return;
        }

        System.out.println("Enter new Course : ");
        String course = sc.nextLine();
        if(course.trim().isEmpty()){
            System.out.println("Course cannot be null!");
            return;
        }

        System.out.println("Enter new Marks: ");
        double marks;
        try{
            marks = Double.parseDouble(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        if(marks < 0 || marks > 100){
            System.out.println("Marks must be between 0 and 100!");
            return;
        }

        student.setAge(age);
        student.setName(name);
        student.setCourse(course);
        student.setMarks(marks);

        System.out.println("Student Details Updated Successfully!");
    }

    public void showStudents(){
        System.out.println("Students List : ");
        if(students.isEmpty()){
            System.out.println("No Students found!");
        }else{
            for(StudentDetails student : students){
                System.out.println(student);
            }
        }
    }

    public void showSpecificStudent(){
        System.out.println("Enter Student ID : ");
        int id;
        try{
            id = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }

        StudentDetails student = findStudent(id);

        if(student == null){
            System.out.println("Student not found!");
            return;
        }

        System.out.println(student);
        
    }

}
