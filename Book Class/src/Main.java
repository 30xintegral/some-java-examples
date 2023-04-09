import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of book? ");
        String bookName = scanner.nextLine();
        while(true){
            System.out.println("How many pages is the book");
            int pages = scanner.nextInt();
            if(pages<1){
                System.out.println("Pages cannot be negative or equal one");
                break;
            }
            Book book1 = new Book(bookName, pages);
            System.out.println("How many pages have you read ?");
            int pageRead = scanner.nextInt();
            book1.setPageRead(pageRead);
            int pageRemain = book1.calculate(pageRead);
            System.out.println("you need to read more " + pageRemain + " pages");
            break;
        }

    }

}
