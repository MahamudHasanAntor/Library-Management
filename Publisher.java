public class Publisher {
    int id;
    String name;
    String contactNo;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
     
    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
     
    public String getContactNo(){
        return contactNo;
    }
}