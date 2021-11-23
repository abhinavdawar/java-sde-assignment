package employeeAndEmployer;

public class Corporate {
    private int corporate_id;
    private String employer_name;
    private int totalCount;

    public void setCorporate_id(int corporate_id) {
        this.corporate_id = corporate_id;
        totalCount++;
    }

    public int getCorporate_id() {
        return corporate_id;
    }

    public String getEmployer_name(){
        return employer_name;
    }

    public void setEmployer_name(String employer_name){
        this.employer_name=employer_name;
    }

    public int getTotalCount(){
        return totalCount;
    }
}
