package video5.dersNLayeredDemo;

import video5.dersNLayeredDemo.business.abstracts.ProductService;
import video5.dersNLayeredDemo.business.concretes.ProductManager;
import video5.dersNLayeredDemo.core.JLoggerManagerAdapter;
import video5.dersNLayeredDemo.dataAccess.concretes.ABCProductDao;
import video5.dersNLayeredDemo.dataAccess.concretes.HibernateProductDao;
import video5.dersNLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new ABCProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(5,2,"Apple",5,50);
		productService.add(product);
	}

}
