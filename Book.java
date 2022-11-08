import java.util.Scanner;

public class Book{
    int id;
    String title;
    String subTitle;
    Author author;
    Publisher publisher;
    double price;

    Scanner in = new Scanner(System.in);

    public void setId(int id){
        this.id=id;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setSubTitle(String subTitle){
        this.subTitle=subTitle;
    }

    public void setAuthor(Author author){
        this.author=author;
        System.out.println("Enter Author ID: ");
        int authorId = in.nextInt();
        in.nextLine();
        author.setId(authorId);

        System.out.println("Enter Author Name: ");
        String name = in.nextLine();
        author.setName(name);

        System.out.println("Enter Author Email: ");
        String email = in.nextLine();
        author.setEmail(email);
    }
    public void setPublisher(Publisher publisher){
        this.publisher=publisher;

        System.out.println("Enter Publisher ID: ");
        int publisherId = in.nextInt();
        in.nextLine();
        publisher.setId(publisherId);

        System.out.println("Enter Publisher Name: ");
        String name = in.nextLine();
        publisher.setName(name);

        System.out.println("Enter Publisher Contact NO: ");
        String contactNo = in.nextLine();
        publisher.setContactNo(contactNo);
    }
    public void setPrice(double price){
        this.price=price;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public String getSubTitle(){
        return subTitle;
    }

    public double getPrice(){
        return price;
    }

   

}