package order;

public class Orders {
    private int emp_id;
    private String status;
    private String created_at;

    public int getEmp_id(){
        return emp_id;
    }

    public void setEmp_id(int emp_id){
        this.emp_id=emp_id;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getCreated_at(){
        return created_at;
    }

    public void setCreated_at(String created_at){
        this.created_at=created_at;
    }
}
