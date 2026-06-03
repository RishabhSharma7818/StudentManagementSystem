package StudentManagementSystem.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

         while(true){
            System.out.println("=============Student Management System=============");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Show All Students Details");
            System.out.println("5. Show Specific Student Details");
            System.out.println("6. Exit");

            System.out.println("Please enter choice : ");
            int choice;
            try{
                choice = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Please enter right choice!");
                continue;
            }

            switch(choice){
                case 1 -> studentSystem.addStudent();
                case 2 -> studentSystem.deleteStudent();
                case 3 -> studentSystem.updateStudent();
                case 4 -> studentSystem.showStudents();
                case 5 -> studentSystem.showSpecificStudent();
                case 6 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invaid choice!");
            }
        }

    }
}
