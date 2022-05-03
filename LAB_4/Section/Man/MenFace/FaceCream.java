package Section.Man.MenFace;
import Section.Man.Mens;

public class FaceCream extends Mens{
	private String _size;
	private String color;
	private String type;
	private String Company;
	// setter
	public void setSize(String sz){
		this._size = sz;
	}
	public void setColor(String col){
		this.color = col;
	}
	public void setType(String tp){
		this.type = tp;
	}
	public void setCompany(String sl){
		this.Company = sl;
	}
	// getter
	public String getSize(){
		return this._size;
	}
	public String getColor(){
		return this.color;
	}
	public String getCompany(){
		return this.type;
	}
	public String getSleeve(){
		return this.Company;
	}
	public void displayDetails(){
		System.out.println("Product ID :- "+this.getProductId());
		System.out.println("Product Name :- "+this.getProductName());
		System.out.println("Product Price :- "+this.getProductPrice());
		System.out.println("Product Description :- "+this.getProductDescription());
		System.out.println("Product Type :- "+this.type);
		System.out.println("Product Size :- "+this._size);
		System.out.println("Product Company :- "+this.Company);
		System.out.println("Product color :- "+this.color);
	}
}


