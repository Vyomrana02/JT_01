package ProductPackage;

abstract public class Product{
	private String product_id;
	private String product_name;
	private int product_price;
	private String product_description;
	private static int number_of_products;
	//Constructor
	public Product(){
		number_of_products ++;
	}
	// always 1st executing non parameterised constructor then after executing parameterised constructor 
	public Product(String pid,String pname,String desc){
		this(); // it will increase no of products every time when product object would creating 
		// also we can use initializer block for increamenting static variable
		this.product_id = pid;
		this.product_name = pname;
		this.product_description = desc;
		//number_of_products += 1;
	}

	//initilizer block
	static {
		number_of_products = 0;
	}

	//static methods
	public static int getNumberOfProduct(){
		return number_of_products;
	}

	//methods
	// setter
	public void setProductId(String pid){
		this.product_id = pid;
	}
	public void setProductName(String pname){
		this.product_name = pname;
	}
	public void setProductPrice(int pprice){
		this.product_price = pprice;
	}
	public void setProductDescription(String pdesc){
		this.product_description = pdesc;
	}
	// getter
	public String getProductId(){
		return this.product_id;
	}
	public String getProductName(){
		return this.product_name;
	}
	public int getProductPrice(){
		return this.product_price;
	}
	public String getProductDescription(){
		return this.product_description;
	}
}
