import com.exmple.entity.Student;
import com.exmple.model.StudentList;
import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu(){
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id. ");
        System.out.println("5. Print student info in descending order of mark");
        System.out.println("6. Exit");
    }
}
