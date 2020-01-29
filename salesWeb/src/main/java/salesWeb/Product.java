package salesWeb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//?????
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String productName;
	@Column
	private String photo;
	@Column
	private Integer price;
	
	public Product() {
	}
	
	public Product(Integer id, String productName, String photo) {
		this.id = id;
		this.productName = productName;
		this.photo = photo;
	}

	public Product(Integer id, String productName, String photo, Integer price) {
		this.id = id;
		this.productName = productName;
		this.photo = photo;
		this.price = price;
	}
	
	public Integer getCode() {
		return id;
	}

	public void setCode(Integer id) {
		this.id = id;
	}

	public String getName() {
		return productName;
	}

	public void setName(String productName) {
		this.productName = productName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", photo=" + photo + ", price=" + price + "]";
	}
}
