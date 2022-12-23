package oopIntroo;

public class ProductManager {

	//is yapan ve ozellik bulunduranlar farklı class'ta bulunmalıdır.
	
	public void addToCart(Product product) {
		System.out.println("Sepete eklendi " + product.getName());
	}
}
