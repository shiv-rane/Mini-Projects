public class Books {
    private String title;
    private String author;
    private String ISBN;
    public Books(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
}


