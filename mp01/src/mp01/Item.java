package mp01;

public class Item {
	private String id;
	private String name;
	private Float price;
	private Float quntity;
	private Float sum;

	public Item(String id, String name, Float price, Float quntity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quntity = quntity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getQuntity() {
		return quntity;
	}

	public void setQuntity(Float quntity) {
		this.quntity = quntity;
	}

	public Float getSum() {
		return quntity * price;
	}

}
