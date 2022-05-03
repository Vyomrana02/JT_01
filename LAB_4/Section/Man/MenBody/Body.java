package Section.Man.MenBody;
import Section.Man.Mens;

public class Body extends Mens{
	private static int number_of_products_man_nightwear;
	public Body(){
		number_of_products_man_nightwear ++;
	}
	//initilizer block
	static {
		number_of_products_man_nightwear = 0;
	}
	//static methods
	public static int getNumberOfProductMansNightWear(){
		return number_of_products_man_nightwear;
	}
}
