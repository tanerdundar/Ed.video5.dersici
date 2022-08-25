package video5.dersNLayeredDemo.dataAccess.concretes;

import java.util.List;

import video5.dersNLayeredDemo.dataAccess.abstracts.ProductDao;
import video5.dersNLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " added with Hibernate.");	
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub	
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
