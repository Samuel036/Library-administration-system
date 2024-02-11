import java.util.Scanner;

public class TestLibrary
{
  public static void main(String[] args) {
    Library library = new Library("HKUST Library");
    int option;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Command:");
      System.out.println("(1) Add a textbook");
      System.out.println("(2) Remove a textbook");
      System.out.println("(3) Find a textbook");
      System.out.println("(4) Check number of textbooks");
      System.out.println("(5) List all textbooks");
      System.out.println("(6) Quit");
      System.out.print("\nOption: ");
      option = sc.nextInt();
      sc.nextLine();
      switch(option) {
        case 1:
          System.out.print("Enter textbook's title: ");
          String title = sc.nextLine();
          System.out.print("Enter textbook's author: ");
          String author = sc.nextLine();
          System.out.print("Enter textbook's publish year: ");
          int publishYear = sc.nextInt();
          sc.nextLine();
          System.out.print("For which course? ");
          String course = sc.nextLine();
          System.out.print("Enter number of loan days: ");
          int loanDays = sc.nextInt();
          sc.nextLine();
          TextBook textBook = new TextBook(title, author, publishYear, course, loanDays);
          library.addTextBook(textBook);
          break;
        case 2:
          System.out.print("Enter textbook's title: ");
          title = sc.nextLine();
          System.out.println(library.removeTextBook(title) ?
                          "Remove successfully" : "Failed");
           break;
        case 3:
          System.out.print("Enter textbook's title: ");
          title = sc.nextLine();
          TextBook book = library.findTextBook(title);
          if(book != null) {
            System.out.println("Found");
            System.out.println(book);
          }
          else
            System.out.println("Not found");
          break;
        case 4:
          System.out.println("Number of textbooks: " + library.getNumOfTextBooks());
          break;
        case 5:
          library.listTextBooks();
      }
      System.out.println();
    }while(option != 6);
    sc.close();
  } 
}
