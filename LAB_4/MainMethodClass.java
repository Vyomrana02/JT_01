// import java.util.*;
// import java.util.Vector;
import ProductPackage.*;
import Section.Man.MenBody.*;
import Section.Man.MenFace.*;
import Section.Man.MenHair.*;
import Section.Children.Child.*;
import Section.Children.ChildFace.*;
import Section.Children.ChildHair.*;
import Section.Woman.WomenFace.*;
import Section.Woman.WomenHair.*;
// Importing Customer Files
import CustomerDetails.*;
import CustomerDetails.OrderDetails.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;  

public class MainMethodClass {
	public static void main(String[] args){
		// Adding Products to inventory line 28-85

		// MBodyCream mp1 = new MBodyCream("mp0001","man Cream",500,"SPF 300","L","Black","Suncream");
		// String Product_filename = "Products.txt";
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Product_filename,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(mp1);
              
        //     out.close();
        //     file.close();
              
        //     // System.out.println("Object has been serialized");
  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }
		// mp1.setProductId("mp0001");
		// mp1.setProductName("man Cream");
		// mp1.setProductPrice(500);
		// mp1.setProductDescription("SPF 300");
		// mp1.setSize("L");
		// mp1.setColor("Black");
		// mp1.setType("Suncream");
		// System.out.println("Man Cream Details :- ");
		// mp1.displayDetails();
		// System.out.println("---------------------\n");

		// WCleanser mp2 = new WCleanser("mp0002","Cleanser",500,"SPF 200","L","orange");
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Product_filename,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(mp2);
              
        //     out.close();
        //     file.close();
              
        //     // System.out.println("Object has been serialized");
  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }
	
		// mp2.setProductId("mp0002");
		// mp2.setProductName("Cleanser");
		// mp2.setProductPrice(500);
		// mp2.setProductDescription("SPF 200");
		// mp2.setSize("L");
		// mp2.setColor("orange");
		// System.out.println("Women Cleanser Details :- ");
		// mp2.displayDetails();
		// System.out.println("---------------------\n");

		// Adding Custtomers to customer_file line 88-104

		// String Customer_file = "Customers.txt";
		// Customer c1 = new Customer("CE116","John Wick");
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Customer_file,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(c1);
              
        //     out.close();
        //     file.close();
        //     // System.out.println("Object has been serialized");  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }


		// Adding orders to Order_file line 107-185

		// String Order_file = "Order_file.txt";
		// Order o1 = new Order("CE116","John Wick","P102", "P10", "Mens BodyCream", 500, 10);
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Order_file,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(01);
              
        //     out.close();
        //     file.close();
        //     // System.out.println("Object has been serialized");  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }
		
		// c1.setCustomerId("CE116");
		// c1.setCustomerName("John Wick");
		// Customer c1 = new Customer("Ashutosh-3 Society"\, "Bharuch", "Gujarat", "392001");
		// c1.setBillingAdress("Ashutosh-3 Society", "Bharuch", "Gujarat", "392001");
		// c1.setShippingAdress("Ashutosh-3 Society", "Bharuch", "Gujarat", "392001");
		// c1.addToCartProduct("P102", "P10", "Mens BodyCream", 500, 10);
		// o1 = new Order("CE116","John Wick","P103", "P12", "WMakeup", 200, 1);
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Order_file,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(01);
              
        //     out.close();
        //     file.close();
        //     // System.out.println("Object has been serialized");  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }
		// c1.addToCartProduct("P103", "P12", "WMakeup", 200, 1);
		// o1 = new Order("CE116","John Wick","P104", "P13", "WFacewash", 100, 2);
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Order_file,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(01);
              
        //     out.close();
        //     file.close();
        //     // System.out.println("Object has been serialized");  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }

		// c1.addToCartProduct("P104", "P13", "WFacewash", 100, 2);
		// o1 = new Order("CE116","John Wick","P105", "P14", "Woil", 800, 20);
		// try{   
        //     //Saving of object in a file
        //     FileOutputStream file = new FileOutputStream(Order_file,true);
        //     ObjectOutputStream out = new ObjectOutputStream(file);
              
        //     // Method for serialization of object
        //     out.writeObject(01);
              
        //     out.close();
        //     file.close();
        //     // System.out.println("Object has been serialized");  
        // }        
        // catch(Exception ex){
		// 	System.out.println("IOException is caught");
		// }
		// c1.addToCartProduct("P105", "P14", "Woil", 800, 20);	
		// c1.printCustomerDetails();
		// c1.printCustomersOrders();

		//Making use of araylist to sortby date

		// System.out.println("Number of Products :- "+Product.getNumberOfProduct()/2);
		// class SortByDate implements Comparator<Order> {
		// 	@Override
		// 	public int compare(Order a, Order b) {
		// 		return a.date.compareTo(b.date);
		// 	}
		// }
		
		// List<Order> OrderList = new ArrayList<>();
		// OrderList.add(new Order("CE116","John Wick","P105", "P14", "Woil", 800, 20,"2020-03-25"));
		// OrderList.add(new Order("CE116","John Wick","P104", "P13", "WFacewash", 100, 2,"2019-01-27"));
		// OrderList.add(new Order("CE116","John Wick","P103", "P12", "WMakeup", 200, 1,"2020-03-26"));
		// OrderList.add(new Order("CE116","John Wick","P102", "P10", "Mens BodyCream", 500, 10,"2020-02-26"));
		// Collections.sort(OrderList, new SortByDate());
		// for (Order order : OrderList) {
		// 	System.out.println(order);
		// }

		//if quantity > 100 then label will Print Large
		
		// System.out.println(o1.RetLabel());
	}
}
