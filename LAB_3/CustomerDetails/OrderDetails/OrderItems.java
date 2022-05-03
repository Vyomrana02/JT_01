package CustomerDetails.OrderDetails;
import ProductPackage.*;

public class OrderItems extends Product{
    private int product_quentity;
    public OrderItems(String pid,String pname,String pdesc,int pprice,int pquentity){
        this.setProductId(pid);
        this.setProductName(pname);
        this.setProductDescription(pdesc);
        this.setProductPrice(pprice);
        this.product_quentity = pquentity;
    }
    public int getProductQuentity(){
        return this.product_quentity;
    }
    public void increaseQuentity(int que){
        this.product_quentity += que;
    }
    public void decreaseQuentity(int que){
        this.product_quentity -= que;
    }
}                                                     