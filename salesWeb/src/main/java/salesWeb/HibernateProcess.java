package salesWeb;

import java.util.List;
import org.hibernate.Session;

public class HibernateProcess {
	public List<Product> getAllProducts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        @SuppressWarnings("unchecked")
        List<Product> products = (List<Product>) session.createQuery(
                "FROM Product s ORDER BY s.id ASC").list();
 
        session.getTransaction().commit();
        session.close();
        return products;
    }
	
    public void updateProduct(int id, Integer price) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        Product product = (Product) session.get(Product.class, id);
        product.setPrice(price);
        session.getTransaction().commit();
        session.close();
    }
	
}
