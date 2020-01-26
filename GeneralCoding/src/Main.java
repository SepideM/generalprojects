import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int num = scan.nextInt();
        scan.close();

        School school = new School(num);
        System.out.println("School: " + school);
    }
}
