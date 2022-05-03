public class ProductDepartment{
     public class Personal extends Product{
        private int price;
        private float rating;
        private String color;
        private float discount;
        //constructors
        public Personal(){
            price = 0;
            rating = 0f;
            color = null;
            discount = 0f;
        }
        
        public Personal(int id,String name,String description,int price,float rating,String color,float discount){
            super(id,name,description);
            this.price = price;
            this.rating = rating;
            this.color = color;
            this.discount = discount;
        }

        //Implemetnting tostring
        public String toString(){
            return "Price: "+price+" Rating: "+rating+"Color: "+color+"Discount: "+discount;
        }
     }
}
