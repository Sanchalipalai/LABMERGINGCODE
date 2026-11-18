
import java.util.Scanner;

public class SearchBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Java Programming",
            "Python Basics",
            "Data Structures",
            "Database Management"
        };

        System.out.print("Enter book name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String book : books) {
            if (book.equalsIgnoreCase(search)) {
                System.out.println("Book Found: " + book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }

        sc.close();
    }
}
