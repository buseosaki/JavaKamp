package oopIntroo;

public class Product {
	
	//encapsulation
	//final disardan erisilemez demek ama sadece constructorda set edilebilir demek.bunun yerine private kullanalım. private sadece bu classın içinde kullanılabilir demek.
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	
	//unitPricaAfterDiscount yani indirim sonrası fiyat elle verilemez, okunmalı. o yuzden getter setter kullanmalıyız. sap tıkladık.
	//get okuma, set yazma gibi düşün. unitpriceafter discountta set olmamalı. yazmayacağız.
	
	// Constructor (yapıcı)
	//Constructor'ı sağ tıklayıp generate constructer field ile oluşturabilirsin.
	
	/* public Product() { 
		System.out.println("Calistim");
	}
	*/
	//parantez içinde yollayabilmek için şu şablonu oluşturmalısın:
	public Product(int id,String name, double unitPrice, String detail, double discount) {
		//bunlari esitlemeliyiz.this'i, bu classtaki gibi dusunebilirsin. 
		//this, product'ın id'si gibiymis.
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
		
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//get, okuma demiştik.
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	
	
	 

} 
