package video5.dersNLayeredDemo.business.concretes;

import java.util.List;

import video5.dersNLayeredDemo.business.abstracts.ProductService;
import video5.dersNLayeredDemo.core.LoggerService;
import video5.dersNLayeredDemo.dataAccess.abstracts.ProductDao;
import video5.dersNLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao , LoggerService loggerService) {
		
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("This product is with not acceptable category ID.");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem(product.getName() + " added.");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
