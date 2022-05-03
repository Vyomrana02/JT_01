public class Product{
    private int id;
    private String name;
    private String description;
    public static int numberOfProducts;

    static{
        numberOfProducts = 0;
    }
    //constructors
    public Product(){
        id = 0;
        name = null;
        description = null;
    }
    public Product(int id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
        numberOfProducts++;
    }
    //getter and setter methods
    public int getid(){
        return this.id; 
    }
    public void setid(int id){
        this.id = id; 
    }
    
    public String getname(){
        return this.name; 
    }
    public void setname(String name){
        this.name = name; 
    }

    public String getdescription(){
        return this.description; 
    }
    public void setdescription(String description){
        this.description = description; 
    }
    
    //implementing tostring
    public String toString(){
        return "id: "+ id + " Name: "+ name + " Description "+description;
    }

    //static methods to return no_of_products
    public static int getNumberOfProducts(){
        return numberOfProducts;
    }

}