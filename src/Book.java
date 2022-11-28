public class Book {
    private Author author;
    private int yearOfPublishing;
    public Book (Author author, int yearOfPublishing){
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;

    }

    public String getAuthor() {
        return author.getName();
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
