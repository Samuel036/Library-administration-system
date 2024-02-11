public class TextBook extends Book
{
    private String course;
    private int loanDays;
    public TextBook(String title, String author, int publishYear,
                String course, int loanDays) {
        super(title, author, publishYear);
        this.course = course;
            this.loanDays = loanDays;
    }
    public String getCourse() {
        return course;
    }
    public int getLoanDays() {
        return loanDays;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }
    public String toString() {
        return super.toString() + "\n" +
                "Course: " + course + "\n" +
                "Loan days: " + loanDays;
    }
}