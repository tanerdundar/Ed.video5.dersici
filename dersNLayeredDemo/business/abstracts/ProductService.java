package video5.dersNLayeredDemo.business.abstracts;

import java.util.List;

import video5.dersNLayeredDemo.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	List<Product> getAll();

}
