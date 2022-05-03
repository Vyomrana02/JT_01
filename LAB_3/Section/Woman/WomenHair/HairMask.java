package Section.Woman.WomenHair;
import Section.Woman.Womens;

public class HairMask extends Womens{
	private static int number_of_products_woman;
	public HairMask(){
		number_of_products_woman ++;
	}
	//initilizer block
	static {
		number_of_products_woman = 0;
	}
	public static int getNumberOfProductWomans(){
		return number_of_products_woman;
	}
}
