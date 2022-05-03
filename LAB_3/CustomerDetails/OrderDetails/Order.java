package CustomerDetails.OrderDetails;
import java.util.ArrayList;
// import CustomerDetails.OrderDetails.Order;
import java.util.List;

import ProductPackage.Product;

public class Order extends Product{
    // private String customer_id;
    private ArrayList<OrderItems> orders = new ArrayList<OrderItems>();
    public Order(){
        
    };
    // public ArrayList<OrderItems> toString(){
    //     return orders;
    // }
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
    public ArrayList<OrderItems> MyNonRepeatedOrders() {
        ArrayList<OrderItems> newList = new ArrayList<OrderItems>();
  
        // Traverse through the first list
        for (OrderItems element : orders) {
             // If this element is not present in newList
            // then add it
            if (!newList.contains(element))
                  newList.add(element);
        }
  
        // return the new list
        return newList;
    }
    
}
