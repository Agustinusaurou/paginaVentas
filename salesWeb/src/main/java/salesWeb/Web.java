package salesWeb;

import java.util.List;

public class Web {

	public static void main(String[] args) {
		HibernateProcess hProcess = new HibernateProcess();

		List<Product> products = hProcess.getAllProducts();
		System.out.println("List of all persisted students >>>");
		for (Product product : products) {
			System.out.println("Persisted product :" + product);
		}
	}
}
