public class Book
{
  /* 変数 */
  private String title;
  private String author;
  private int publishYear;

  public Book(String t, String a, int p) {
    title = t;
    author = a;
    publishYear = p;
  }
  
  public String getTitle() { return title; }

  public String getAuthor() { return author; }

  public int getPublishYear() { return publishYear; }

  public void setTitle(String t) { title = t; }

  public void setAuthor(String a) { author = a; }

  public void setPublishYear(int p) { publishYear = p; }
  
  public String toString() {
    return "Title: " + title + "\n" +
           "Author: " + author + "\n" +
           "Publish year: " + publishYear;
  } 
}
