package main.java.yaksha;
import main.java.yaksha.Product;
	import java.util.stream.Collectors;  
	import java.util.List;  
	import java.util.ArrayList;  
	
	public class LaptopCollectors {  
	    public static void main(String[] args) {  
	    	boolean status=addLaptopDetails();
	        
	    } 
	    public static boolean  addLaptopDetails() {
        	List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList =
        productsList.stream().map(x->x.getPrice()).collect(Collectors.toList());    
        System.out.println(productPriceList);
        return true;
        } 
	 	 
	}  

