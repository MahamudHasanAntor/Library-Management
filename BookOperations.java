import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BookOperations{
    File file = new File("data/books.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    String line;
    int count;
    char choice;
    Author author; 
    Publisher publisher;
    String id;
    boolean bookStatus = true;
    Scanner in = new Scanner(System.in);
    boolean doesContain;

    public void insertBook(Book b){

        System.out.println("Enter Book ID: ");
        int bId=in.nextInt();
        b.setId(bId);
        in.nextLine();

        System.out.println("Enter Book Title ");
        String title = in.nextLine();
        b.setTitle(title);

        System.out.println("Enter Book SubTitle: ");
        String subTitle = in.nextLine();
        b.setSubTitle(subTitle);

        System.out.println("\n\tAuthor details");

        author=new Author();
        b.setAuthor(author);

        System.out.println("\n\tPublisher details");
        
        publisher=new Publisher();
        b.setPublisher(publisher);
        
        System.out.println("Enter Price: ");
        double price = in.nextInt();
        b.setPrice(price);

        
            try {
            
                fileWriter = new FileWriter(file, true);
                 fileWriter.write("\nBook ID: " + b.getId() + "\nTitle: "+ b.getTitle() + "\nSubTitle: "+ b.getSubTitle() +
                 "\nAuthor ID: "+ author.getId() +"\nAuthor Name: "+ author.getName() + "\nAuthor Email: " + author.getEmail() +"\nPublisher ID: "+ publisher.getId() +
                 "\nPublisher Name: "+ publisher.getName() + "\nPublisher Contact NO: "+ publisher.getContactNo() + "\nBook Price:" + b.getPrice() );
                 System.out.println("\n\t\t\tInformation Sucessfully added!!!\t\t\t");
            }
            catch(IOException io) {
                System.out.println("IOException caught!!");
            }
            finally {
                try {
                    fileWriter.close();
                }
                catch(IOException io) {
                    System.out.println("Can not close the resource!!");
                }
            }
        
       
    }

    public Book getBook(int bookId){
        Book bk = new Book();
        id = Integer.toString(bookId);
        int numberOfLinePrint = 9;
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            doesContain = false;
            count = 0;
            while((line = bufferedReader.readLine())!= null){
                if(line.contains("Book ID: "+id)){
                    doesContain = true;
                    System.out.println(line);
                    count++;
                    continue;
                }
                else if(doesContain && count < numberOfLinePrint){
                    count++;
                    System.out.println(line);
                }
                else if(doesContain && count == numberOfLinePrint){
                    System.out.println(line);
                    doesContain = false;
                }
            }
        }

        catch(IOException io) {
            System.out.println("IOException caught!!");
        }

        finally{
            try{
                fileReader.close();

            }
            catch(IOException io){
                System.out.println("Can not close the resource!");
            }

        }
        return bk;
    }

    public void showAllBooks(){
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(IOException io){
            System.out.println("IOException caught!");
        }

        finally{
            try{
                fileReader.close();
            }
            catch(IOException io){
                System.out.println("Can not close the resource!");
            }
        }
    }
}