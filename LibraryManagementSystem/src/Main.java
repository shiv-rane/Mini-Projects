import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("Enter the title: ");
        String bookTitle = scan.nextLine();
        
        System.out.println("Enter the Author: ");
        String bookAuthor = scan.nextLine();
        
        System.out.println("Enter the ISBN: ");
        String bookISBN = scan.nextLine();
        library.addBook(bookTitle,bookAuthor,bookISBN);
        scan.close();
        library.displayAll();
    }
}