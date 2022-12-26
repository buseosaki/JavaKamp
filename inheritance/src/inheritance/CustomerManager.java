package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi. ");
		
	    }
	
	/* 
	 * Customer olarak göndermeden önce, ayrı method oluşturup yapmıştık.
	 * iki tane add methodu oluşturunca, overloading yapmış olduk.
	 
	public void add(IndividualCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi. ");
	}
	
	public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi. ");
	}
		
	 * Bunun yerine Customer olarak gönderiyoruz ve çalışıyor. (POLYMORPHİSM)
	 * Customer, onu extend eden referansların yerini tutabilir.
	 */
	// bulk insert Individual ve corporate müşterilerin verilerini eklediğimiz örnek bir operasyon: Birden fazla müşteri olduğu için array oluşturulur.
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
    
}