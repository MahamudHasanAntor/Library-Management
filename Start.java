import java.util.Scanner;

public class Start{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StudentOperations studentoperations=new StudentOperations();
        Student student=new Student();

        TeacherOperations teacheroperations=new TeacherOperations();
        Teacher teacher=new Teacher();

        BookOperations bookoperations=new BookOperations();
        Book book=new Book();

        BasicOperations basicoperations=new BasicOperations();
        Patron patrons ;

    
        int i=1;
        while(i!=-1){
            System.out.println("\nMAIN MENU\n[1] Student Management\n[2] Teacher Management\n[3] Book Management\n[4] Basic Operations\n[5] Exit");
            System.out.println("Enter the choice:");
            int choice=in.nextInt();
           
            if(choice==1){
                while(i!=-2){
                    System.out.println("\nStudent Management\n[1] Insert New Student\n[2] Search by studentId\n[3] Show All Student\n[4] Main Manu\n");
                    System.out.println("Enter the choice:");
                    int student_choice =in.nextInt();
                    if(student_choice==1){
                        studentoperations.insertStudent(student);
                        continue;
                   }
                    else if(student_choice==2){
                        System.out.println("Enter student ID:");
                        int id=in.nextInt();
                        studentoperations.getStudent(id);
                        continue;
                    }
                    else if(student_choice==3){
                        studentoperations.showAllStudents();
                        continue;
                    }
                    else{
                        break;
                    }

                }
            }

            else if(choice==2){
                while(i!=-2){
                    System.out.println("\n\t\tTeacher Management\n[1] Insert New Teacher\n[2] Search by teacherId\n[3] Show All Teacher\n\t\t[4] Main Manu\n\t\t=================\n\t\t");
                    System.out.println("Enter the choice:");
                    int teacher_choice =in.nextInt();
                    if(teacher_choice==1){
                        teacheroperations.insertTeacher(teacher);
                        continue;
                    }
                
                    else if(teacher_choice==2){
                        System.out.println("Enter teacher ID:");
                        int id=in.nextInt();
                        teacheroperations.getTeacher(id);
                        continue;
                    }
                    else if(teacher_choice==3){
                        teacheroperations.showAllTeachers();
                        continue;
                    }
                    else{
                        break;
                    }
                
               }
                
           }
           else if(choice==3){
            while(i!=-2){
                System.out.println("\n\t\tBook Management\n\t\t[1] Insert New Book\n\t\t[2] Search by bookId\n\t\t[3] Show All Books\n\t\t[4] Main Manu\n");
                System.out.println("Enter the choice:");
                int teacher_choice =in.nextInt();
                if(teacher_choice==1){
                    bookoperations.insertBook(book);
                    continue;
                }
            
                else if(teacher_choice==2){
                    System.out.println("Enter Book ID:");
                    int id=in.nextInt();
                    bookoperations.getBook(id);
                    continue;
                }
                else if(teacher_choice==3){
                    bookoperations.showAllBooks();
                    continue;
                }
                else{
                    break;
                }
            
		}
           }

           else if(choice==4){
            while(i!=-2){
                System.out.println("\n Book Borrow/Return/Lost Management:\n[1] Borrow book\n\t\t[2] Return Book\n\t\t[3] Add Fine\n\t\t[4] Main Manu\n");
                System.out.println("\tEnter the choice:");
                int basic_choice =in.nextInt();

                if(basic_choice == 1){
                    patrons=student;
                    basicoperations.borrow(patrons,book);
                    continue;
                }
            
                else if(basic_choice == 2){
                    patrons=teacher;
                    basicoperations.returnBook(patrons,book);
                    continue;
                }
                else if(basic_choice==3){
                    double amount;
                    patrons=student;
                    System.out.println("\n1.For book lost = 1000 taka\n2.For late return = 100 taka");
                    int fine_choice=in.nextInt();     
                        amount=1000;
                        System.out.println("For lost book fine=1000 taka");
                        basicoperations. fine(patrons,amount);

                        continue;
                }
                else{
                    break;
                }
            
           }
           }

            else {
                
                break;
            }
            
        }
        
    }
}