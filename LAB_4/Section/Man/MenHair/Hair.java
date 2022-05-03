package Section.Man.MenHair;
import Section.Man.Mens;

public class Hair extends Mens{
	private static int number_of_products_man;
	public Hair(){
		number_of_products_man ++;
	}
	//initilizer block
	static {
		number_of_products_man = 0;
	}
	public static int getNumberOfProductMan(){
		return number_of_products_man;
	}
}
