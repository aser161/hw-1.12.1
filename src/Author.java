import java.util.Objects;

public class Author {
    private String name;

    public Author (String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + ": ";
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



}
