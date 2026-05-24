/*
You have to implement a library using Java Class Library
- Methods: addBook,issueBook, returnBook,showAvailableBooks
- Properties: 
    + Array to store the available books,
    + Array to store the issued books.
*/

import java.util.Scanner;

class Library{
    String[] availableBooks = new String[10];
    String[] issuedBooks = new String[10];

    
    public Library() {
        availableBooks[0] = "Human nature";
        availableBooks[1] = "Courage to be disliked";
        availableBooks[2] = "Mindset";
        issuedBooks[0] = "Sapiens";
    }

    public int len(String[] arr){
        int cnt=0;
        for (String book:arr){
            if (book!=null){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean isPresent(String bookName,String[] arr){
        for (String book:arr){
            if (book!=null){
                if (book.equals(bookName)){
                    return true;
                }
            }
        }
        return false;
    }

    public void removeBook(String bookName,String[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=null){
                if (arr[i].equals(bookName)){
                    arr[i] = null;
                    return;
                }
            }
        }
    }

    public void showAvailableBooks(){
        System.out.println("Available Books: ");
        for (String book:availableBooks){

            if (book!=null){
            System.out.println("- "+book);
            }
        }
    }

    public void showIssuedBooks(){
        System.out.println("Issued Books: ");
        for (String book:issuedBooks){

            if (book!=null){
            System.out.println("- "+book);
            }
        }
    }

    public void addBook(String bookName) {
        if (len(availableBooks)==10) { System.out.println("Library is full"); return;}
        if (!isPresent(bookName, availableBooks)){
            for (int i=0;i<availableBooks.length;i++){
                if (availableBooks[i]==null){
                    availableBooks[i] = bookName;
                    return;
                }
            }
        }
        else {
            System.out.println("Book already present");
        }
    }

    public void issueBook(String bookName){
        if (len(issuedBooks)==10) { System.out.println("Issued books limit reached"); return;}
        if (isPresent(bookName, availableBooks) ){
            for (int i=0;i<issuedBooks.length;i++){
                if (issuedBooks[i]==null){
                    issuedBooks[i] = bookName;
                    System.out.println("Book issued successfully");
                    removeBook(bookName, availableBooks);
                    return;
                }
            }
        }

        else {
            System.out.println(bookName+" is not available");
        }
    }

    public void returnBook(String bookName){
        if (isPresent(bookName, issuedBooks)) {
            for (int i=0;i<issuedBooks.length;i++){
                if (issuedBooks[i]!=null){
                    if (issuedBooks[i].equals(bookName)){
                        issuedBooks[i] = null;
                        System.out.println("Book returned successfully");
                        addBook(bookName);
                        return;
                    }
                }
            }
        }
        else {
            System.out.println(bookName+" not available in issued books");
        }
        
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) { 
            System.out.println("1.Show available books");
            System.out.println("2.Show issued books");
            System.out.println("3.Add book");
            System.out.println("4.Issue book");
            System.out.println("5.Return book");
            System.out.println("Any negative number to exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            if (choice<0){
                break;
            }
            else if(choice==1){
                library.showAvailableBooks();
                System.out.println();
            }

            else if(choice==2){
                library.showIssuedBooks();
                System.out.println();
            }

            else if(choice==3){
                sc.nextLine();
                System.out.print("Enter book to add: ");
                String bookName = sc.nextLine();
                library.addBook(bookName);
                System.out.println();
            }

            else if(choice==4){
                sc.nextLine();
                System.out.print("Enter book to issue: ");
                String bookName = sc.nextLine();
                library.issueBook(bookName);
                System.out.println();
            }

            else if(choice==5){
                sc.nextLine();
                System.out.print("Enter book to return: ");
                String bookName = sc.nextLine();
                library.returnBook(bookName);
                System.out.println();
            }

            else{
                System.out.println("Please enter a valid choice!!!");
            }
        }
        sc.close();
        System.out.println("Thanks for using...");
    }
}
