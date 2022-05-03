// import ProductDepartment.PersonalCare;

public class DriverProductDepartment {
    public static void main(String args[]){
        //checking if methods are running good
        ProductDepartment d = new ProductDepartment();
        ProductDepartment.Personal e = d.new Personal(1,"a","c",10,3f,"red",40f);
        ProductDepartment f = new ProductDepartment();
        ProductDepartment.Personal g = f.new Personal(2,"b","e",10,3f,"blue",40f);
        ProductDepartment h = new ProductDepartment();
        ProductDepartment.Personal i = h.new Personal(3,"c","f",10,3f,"green",40f);

        System.out.println(ProductDepartment.Personal.getNumberOfProducts());
    }
}
