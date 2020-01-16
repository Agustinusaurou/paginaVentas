package salesWeb;

public class Product {
	private Integer code;
	private String name;
	private String photo;
	private Integer price;
	
	public Product(Integer code, String name, String photo) {
		super();
		this.code = code;
		this.name = name;
		this.photo = photo;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
