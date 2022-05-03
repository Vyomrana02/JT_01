package CustomerDetails.OrderDetails;
import java.util.ArrayList;
// import CustomerDetails.OrderDetails.Order;

import ProductPackage.Product;

public class Order extends Product{
    // private String customer_id;
    public String date;
    private ArrayList<OrderItems> orders = new ArrayList<>();
    // public void label(){
        // return
    // }
    private static int label =0;
    public String RetLabel(){
        if(label>=100)
            return "Large";
        else
            return "Small";
    }
    public Order(){      
    };
    public Order(String string, String string2, String string3, String string4, String string5, int i, int j) {
        label += j;
        
    }
    public Order(String string, String string2, String string3, String string4, String string5, int i, int j,
            String string6) {
            this.date = string6;
    }
    public void OrderList(){
        // this.customer_id = cid;
        this.orders = new ArrayList<>();
    }
    public void addToCart(String pid,String pname,String pdesc,int pprice,int pquentity){
    	OrderItems pro1 = new OrderItems(pid,pname,pdesc,pprice,pquentity);
        // OrderItems pro1 = new OrderItems();
        // pro1.OrderItems(pid,pname,pdesc,pprice,pquentity);
        orders.add(pro1);
    }
    public void printOrderList(){
        for(OrderItems oi : orders){
            System.out.println("Product ID :- " + oi.getProductId());
            System.out.println("Product Name :- " + oi.getProductName());
            System.out.println("Product Price :- " + oi.getProductPrice());
            System.out.println("Product Description :- " + oi.getProductDescription());
            System.out.println("Product Quentity :- " + oi.getProductQuentity());
            System.out.println("------------------------------------");
        }
    }
}
