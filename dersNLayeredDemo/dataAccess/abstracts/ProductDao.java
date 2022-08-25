package video5.dersNLayeredDemo.dataAccess.abstracts;

import java.util.List;  //ArrayList olarak ta kullanabiliriz

import video5.dersNLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	
	public void add(Product product);
	public void update(Product product);
	public void delete(Product product);
	Product get(int id);
	List<Product> getAll();
	

}
