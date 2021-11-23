package insurance;

public class Insurance_products {
    private String name;
    private int merchant_id;
    private int price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getMerchant_id(){
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id){
        this.merchant_id=merchant_id;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}
