package CustomerDetails;
import CustomerDetails.OrderDetails.*;
public class Customer {
    private String customer_id;
    private String customer_name;
    private Address billing_add;
    private Address shipping_add;
    private Order carts = new Order();
    public Customer(){
        billing_add = new Address();
        shipping_add = new Address();
        carts = new Order();
    }
    public Customer(String string, String string2) {
    }
    public Customer(String string, String string2, String string3, String string4, String string5, int i, int j) {
    }
    // setter
    public void setCustomerId(String cid){
        this.customer_id = cid;
    }
    public void setCustomerName(String cname){
        this.customer_name = cname;
    }
    public void setBillingAdress(String _street,String _district,String _state,String _pincode){
        billing_add.setStreet(_street);
        billing_add.setDistrict(_district);
        billing_add.setState(_state);
        billing_add.setPincode(_pincode);
    }
    public void setShippingAdress(String _street,String _district,String _state,String _pincode){
        shipping_add.setStreet(_street);
        shipping_add.setDistrict(_district);
        shipping_add.setState(_state);
        shipping_add.setPincode(_pincode);
    }

    // getter
    public String getCustomerId(){
        return this.customer_id;
    }
    public String getCustomerName(){
        return this.customer_name;
    }
    public Address getBillingAddress(){
        return this.billing_add;
    }
    public Address getShippingAddress(){
        return this.shipping_add;
    }
 
    public void printCustomerDetails(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Customer Details :- ");
        System.out.println("Customer ID :- "+this.customer_id);
        System.out.println("Customer Name :- "+this.customer_name);
        System.out.println("Customer Address :- "+this.billing_add.getStreet() + ", " + this.billing_add.getDistrict() + ", " + this.billing_add.getState() + ", " + this.billing_add.getPincode() + ".");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public void addToCartProduct(String pid,String pname,String pdesc,int pprice,int pquentity){
        this.carts.addToCart(pid,pname,pdesc,pprice,pquentity);
    }

    public void printCustomersOrders(){
        System.out.println("##################################");
        this.carts.printOrderList();
        System.out.println("##################################");
    }
}
