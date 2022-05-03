package CustomerDetails;

public class Address {
    private String street;
    private String district;
    private String state;
    private String pincode;
    // setter
    public void setStreet(String str){
        this.street = str;
    }
    public void setDistrict(String di){
        this.district = di;
    }
    public void setState(String stat){
        this.state = stat;
    }
    public void setPincode(String pin){
        this.pincode = pin;
    }
    // getter
    public String getStreet(){
        return this.street;
    }
    public String getDistrict(){
        return this.district;
    }
    public String getState(){
        return this.state;
    }
    public String getPincode(){
        return this.pincode;
    }
}
