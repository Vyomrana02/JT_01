package Section.Woman.WomenFace;
import Section.Woman.Womens;

public class WOil extends Womens{
	private String type;
	// setter
	public void setType(String tp){
		this.type = tp;
	}
	// getter
	public String getType(){
		return this.type;
	}
	
	public void displayDetails(){
		System.out.println("Product ID :- "+this.getProductId());
		System.out.println("Product Name :- "+this.getProductName());
		System.out.println("Product Price :- "+this.getProductPrice());
		System.out.println("Product Description :- "+this.getProductDescription());
		System.out.println("Product Type :- "+this.type);
	}
}
