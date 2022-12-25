package oopIntroo;

public class Main {

	public static void main(String[] args) {
		
		// product 1de constructor kullanalım
		Product product1 = new Product(1,"blabla",1500,"ivirzivir",10); //örnek oluşturma, referans oluşturma, instance
		
		
		Product product2 = new Product(); //örnek oluşturma, referans oluşturma, instance
		//product 2nin bir alanınını set etmek (ürün bilgilerini) vermek istiyoruz
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
	
		// product2.setUnitPriceAfterDiscount çalışmıyor çünkü hesap sonucunda çıkacak. hesabı 
		// product içinden get içine fonksiyonu yazarak yaptıracağız.
		
		
		/* başta bunu yaptık ancak getter setter ve private verdikten sonra sildik.
		 * yukardaki kısım geçerli olacak.
		 *  product2.id =21;
		 * product2.name="2blabla";
		 * product2.unitPrice= 21500;
		 * product2.detail= "2ivirzivir"; 
		
		//CLASSLARIN REFERANS TİP OLDUĞUNU UNUTMA
		Product[] products = {product1,product2};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
			*/
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/* System.out.println(products.length);
		
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		Category[] categories = {category1, category2};
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		*/
	 } }
