package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi : " + customer.getFirstName());
	    
		//methodu static yaptığımız için newlemeden utils'i kullanabildik.
		Utils.runLoggers(loggers, customer.getFirstName());
		/* for (Logger logger: loggers) {
			logger.log(customer.getFirstName());
			
		}
		
	     * Daha sonra dosyaya yazdır dendiğinde patlayacağı için bu kullanım doğru
	     * değildir. 
	     * DatabaseLogger logger = new DatabaseLogger();
	    logger.log(customer.getFirstName() + "Veritabanına loglandı");
		*/
	}
	
	public void delete(Customer customer) {
		
		System.out.println("Müşteri silindi" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		/* for (Logger logger: loggers) {
			logger.log(customer.getFirstName());
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "Veritabanına loglandı");
		*/
	}
	
	
	
}
