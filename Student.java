public class Student extends Patron{
    String studentId;
    String guardianName;
    String guardianContactNo;

    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    public void setGuardianName(String guardianName){
        this.guardianName=guardianName;
    }
    public void setGuardianContactNo(String guardianContactNo){
        this.guardianContactNo=guardianContactNo;
    }
    public String getStudentId(){
        return studentId;
    }
  
    public String getGuardianName(){
        return guardianName;
    }
    public String getGuardianContactNo(){
        return guardianContactNo;
    }
    public void showInfo(){
        System.out.println("Library ID: "+getId());
        System.out.println("Student ID: "+getStudentId());
        System.out.println("Name: "+getName());
        System.out.println("Department Name: "+getDepartmentName());
        System.out.println("Email: "+getEmail());
        System.out.println("Contact No: "+getContactNo());
        System.out.println("Address: "+getAddress());
        System.out.println("Amount: "+getAddress());
        System.out.println("Gurdian Name: "+getAmount());
        System.out.println("Gurdian Contact No: "+getGuardianContactNo());

    }
    
}