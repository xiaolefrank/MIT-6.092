public class Library {
    // Add the missing implementation to this class
    String addressString;
    Book[] books = new Book[100];
    int bookNumber=0;

    public Library(String address){
        addressString = address;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress(){
        System.out.println(addressString);
    }

    public void addBook(Book new_book){
        books[bookNumber]=new_book;
        bookNumber++;
    }

    public void borrowBook(String borrow_book){
        for(int i=0;i<bookNumber;i++){
            if(books[i].title==borrow_book && !books[i].isBorrowed()){
                books[i].rented();
                System.out.println("You successfully borrowed "+borrow_book);
                return;
            }else if(books[i].title==borrow_book && books[i].isBorrowed()){
                System.out.println("Sorry, this book is already borrowed.");
                return;
            }
         }
        System.out.println("Sorry, this book is not in our catalog."); 
    }

    public void returnBook(String return_book){
        for(int i=0;i<bookNumber;i++){
            if(books[i].title==return_book && books[i].isBorrowed()){
                books[i].returned();
                System.out.println("You successfully returned "+return_book);
                return;
            }
        }
    }

    public void printAvailableBooks(){
        if(bookNumber==0){
            System.out.println("No book in catalog.");
        }else{
            for(int i=0;i<bookNumber;i++){
                if(! books[i].isBorrowed()){
                    System.out.println(books[i].title);
                }
            }
        }
    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
