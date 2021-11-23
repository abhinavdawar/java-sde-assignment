package insurance;

public class Insurance_merchants {
    private int country_code;
    private String merchant_name;
    private int admin_id;
    private int product_id;

    public int getCountry_code(){
        return country_code;
    }

    public void setCountry_code(int country_code){
        this.country_code=country_code;
    }

    public String getMerchant_name(){
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name){
        this.merchant_name=merchant_name;
    }

    public int getAdmin_id(){
        return admin_id;
    }

    public void setAdmin_id(int admin_id){
        this.admin_id=admin_id;
    }

    public int getProduct_id(){
        return product_id;
    }

    public void setProduct_id(int product_id){
        this.product_id=product_id;
    }
}
