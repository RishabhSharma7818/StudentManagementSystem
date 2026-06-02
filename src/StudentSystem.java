package StudentManagementSystem.src;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    ArrayList<StudentDetails> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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

        StudentDetails student = new StudentDetails(id, name, age, course, marks);
        students.add(student);
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
        students.remove(student);
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

        System.out.println("Enter new Name : ");
        String name = sc.nextLine();
        if(name.trim().isEmpty()){
            System.out.println("Name cannot be null!");
            return;
        }
        student.setName(name);

        System.out.println("Enter new Age : ");
        int age; 
        try{
            age = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        student.setAge(age);

        System.out.println("Enter new Course : ");
        String course = sc.nextLine();
         if(course.trim().isEmpty()){
            System.out.println("Course cannot be null!");
            return;
        }
        student.setCourse(course);

        System.out.println("Enter new Marks: ");
        double marks;
        try{
            marks = Double.parseDouble(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
            return;
        }
        student.setMarks(marks);

        System.out.println("Student details updated!");
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


}
