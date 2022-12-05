public class Book {
    private String title;
    private Author author;
    private int yearOfPublishing;
    public Book (String title, Author author, int yearOfPublishing){
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
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

    @Override
    public String toString() {
        return author.toString() + getTitle() + " " + getYearOfPublishing();
    }
}
