package Section.Man;
import ProductPackage.Product;

public class Mens extends Product{
	private static int number_of_products_mans;
	public Mens(){
		number_of_products_mans ++;
	}
	//initilizer block
	static {
		number_of_products_mans = 0;
	}
	//static methods
	public static int getNumberOfProductMans(){
		return number_of_products_mans;
	}
}
// night wear



// marraige wear






// common




