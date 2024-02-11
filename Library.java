public class Library {
  private String name;
  private TextBook[] textBookList;
  private int numOfTextBooks;

  public Library(String name) {
    this.name = name;
    textBookList = new TextBook[1000];
    numOfTextBooks = 0;
  }

  public int getNumOfTextBooks() {
    return numOfTextBooks;
  }

  public void addTextBook(TextBook textBook) {
    if(numOfTextBooks < 1000) {
        textBookList[numOfTextBooks] = textBook;
        ++numOfTextBooks;
    }
    else
        System.out.println("Full");
  }

  public TextBook findTextBook(String name) {
    for(int i=0; i<numOfTextBooks; ++i) {
        if(textBookList[i].getTitle().equals(name))
            return textBookList[i];
    }
    return null;
  }

  public boolean removeTextBook(String name) {
    int foundIndex = -1;
    for(int i=0; i<numOfTextBooks; ++i) {
        if(textBookList[i].getTitle().equals(name)) {  // 0.5 point
            foundIndex = i;
            break; 
        }
    }
    if(foundIndex == -1)
        return false;
    for(int i=foundIndex; i<numOfTextBooks-1; ++i)
        textBookList[i] = textBookList[i+1];
    --numOfTextBooks;
    return true;
  }  
  public void listTextBooks() {
    for(int i=0; i<numOfTextBooks; ++i)
        System.out.println(textBookList[i]);
  }
}