package Section.Children;
import ProductPackage.Product;

// children
public class Child extends Product{
	private static int number_of_products_childs;
	public Child(){
		number_of_products_childs ++;
	}
	//initilizer block
	static {
		number_of_products_childs = 0;
	}
	//static methods
	public static int getNumberOfProductChild(){
		return number_of_products_childs;
	}
}
