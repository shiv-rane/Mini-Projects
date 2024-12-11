import java.util.ArrayList;

public class Library {
    ArrayList<Books> listOfBooks = new ArrayList<>();
    
    public void addBook(String title, String author, String ISBN){
        Books book = new Books(title,author,ISBN);
        listOfBooks.add(book);
    }
    public void removeBook(String ISBN){
        boolean found = false;
    	for(int i = 0; i<listOfBooks.size(); i++){
            if(ISBN.equals(listOfBooks.get(i).getISBN())){
                listOfBooks.remove(i);
                found = true;
                break;
            }  
        }
    	if(!found){
            System.out.println("Can't find Book");
        }
    }
    public void displayAll(){
        for(Books book : listOfBooks){
            System.out.println("Title\t: " + book.gettitle());
            System.out.println("Author\t: " + book.getauthor());
            System.out.println("ISBN\t: " + book.getISBN());
            System.out.println("---------------------------");
        }
    }
}
