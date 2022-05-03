package Section.Man.MenFace;
import Section.Man.Mens;

public class Cleanser extends Mens{
	private String _size;
	private String color;
	private String type;
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
	// getter
	public String getSize(){
		return this._size;
	}
	public String getColor(){
		return this.color;
	}
	public String getType(){
		return this.type;
	}
	public void displayDetails(){
		System.out.println("Product ID :- "+this.getProductId());
		System.out.println("Product Name :- "+this.getProductName());
		System.out.println("Product Price :- "+this.getProductPrice());
		System.out.println("Product Description :- "+this.getProductDescription());
		System.out.println("Product Company Name :- "+this.type);
		System.out.println("Product Size :- "+this._size);
		System.out.println("Product color :- "+this.color);
	}
}

