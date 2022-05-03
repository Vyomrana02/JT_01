package Section.Children.ChildFace;

import Section.Children.Child;

public class FaceMain extends Child{
    private static int number_of_products_child_nightwear;
	public FaceMain(){
		number_of_products_child_nightwear ++;
	}
	//initilizer block
	static {
		number_of_products_child_nightwear = 0;
	}
	//static methods
	public static int getNumberOfProductMansNightWear(){
		return number_of_products_child_nightwear;
	}
}
