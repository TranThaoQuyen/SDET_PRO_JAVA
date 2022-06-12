public class infoBook {
    private String authorName;
    private String year;

    public infoBook() {
    }

    public infoBook(String authorName, String year) {
        this.authorName = authorName;
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "infoBook{" +
                "authorName='" + authorName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
