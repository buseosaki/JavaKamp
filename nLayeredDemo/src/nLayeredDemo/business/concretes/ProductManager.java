package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao; //2 bu yontemle artikmanager hibernate'den değil, kullanacağı dataacces interface'inden haberdar.
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product  product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return;
		}
		
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi "+ product.getName() );
		
		/*  1
		 * Data acces'e bu kadar bağlı olmamalıyız.
		 * HibernateProductDao dao = new HibernateProductDao();
		dao.add(product); 
		* Depencency injection ile gevşek bağlı olmasını sağlayacağız. */
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
