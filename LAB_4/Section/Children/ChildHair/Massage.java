package Section.Children.ChildHair;
import Section.Children.Child;

public class Massage extends Child{
    private String _size;
	private String color;
	private String company_name;
	private String type;
	// setter
	public void setSize(String sz){
		this._size = sz;
	}
	public void setColor(String col){
		this.color = col;
	}
	public void setCompany(String cname){
		this.company_name = cname;
	}
	public void settype(String sl){
		this.type = sl;
	}
	// getter
	public String getSize(){
		return this._size;
	}
	public String getColor(){
		return this.color;
	}
	public String getCompany(){
		return this.company_name;
	}
	public String gettype(){
		return this.type;
	}
	public void displayDetails(){
		System.out.println("Product ID :- "+this.getProductId());
		System.out.println("Product Name :- "+this.getProductName());
		System.out.println("Product Price :- "+this.getProductPrice());
		System.out.println("Product Description :- "+this.getProductDescription());
		System.out.println("Product Company Name :- "+this.company_name);
		System.out.println("Product Size :- "+this._size);
		System.out.println("Product type :- "+this.type);
		System.out.println("Product color :- "+this.color);
	}
}
