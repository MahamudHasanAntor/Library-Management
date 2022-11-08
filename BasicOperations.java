import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


interface IBasicOperations{
    public void borrow(Patron p, Book b);
    public void returnBook(Patron p, Book b);
    public void fine(Patron p, double ammount);
}

public class BasicOperations implements IBasicOperations {
    Scanner in = new Scanner(System.in);
    char choice;

    BookOperations bookOp;
    TeacherOperations teachOp;
    StudentOperations studentOp;
    

    public void borrow(Patron p, Book b){
        System.out.println("Enter Book ID: ");
        int bookId= in.nextInt();
        System.out.println("1. Teacher or 2. Student: ");
        choice = in.next().charAt(0);
        if(choice == '1'){
            System.out.println("Enter Teacher ID:");
            int teacherId = in.nextInt();         
            System.out.println("Please collect book. Thank you!");
        }

        else{
            System.out.println("Enter Student ID:");
            int studentId = in.nextInt();
            System.out.println("Please collect book. Thank you!");   
        }
    }

    public void returnBook(Patron p, Book b){
        System.out.println("Enter Book ID: ");
        System.out.println("1. Teacher or 2. Student: ");
        choice = in.next().charAt(0);
        if(choice == '1'){
            System.out.println("Enter Teacher ID:");
            System.out.println("Do you confirm?(Y/N): ");
            choice = in.next().charAt(0);
            if(choice == 'Y'){
                System.out.println("Book has been returned.");
            }
            else{
                System.out.println("Book has not been returned.");
            }
        }

        else{
            System.out.println("Enter Student ID:");
            choice = in.next().charAt(0);
            if(choice == 'Y'){
                System.out.println("Book has been returned.");
            }
            else{
                System.out.println("Book has not been returned.");
            }  
        }
    }

    public void fine(Patron p, double amount){
        System.out.println("1.Teacher or 2. Student: ");
        choice = in.next().charAt(0);
    }
    
}