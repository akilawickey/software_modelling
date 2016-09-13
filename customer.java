class Customer {

	String name;
	Address deliveryAddress;
	List<Product> products;	

	public Customer(String name,Address a){

		this.name = name;
		deliveryAddress = a;	

	}

	public addProduct(Product p){

		products.add(p);
	}
}
class Address {

	String street;
	String city;
	int postcode;

	public Address(String street,String city,int code){
	
		this.street = street;
		this.city = city;
		postcode = code;

	}

}

class ProductDesc {

	float price;
	String description;

	public ProductDesc(float price,String desc){

		this.price = price;
		description  = desc;
	
	}

}

class Item {
	int quantity;
	Product product;

	public Item(int quantity,Product p){

		this.quantity = quantity;
		product = p;
	}

}

class payment{


}


@Test
class CustomerTest {

	void testCustomer(){

		Address my = new Address("DL Peries Road","Kandy",12323);
		Customer c1 = new Customer("Akila",my);
		Customer c2 = new Customer("Danny",my);
		
		assertEquals(c1.Address == c2.Address);

		Product p1 = new Product("USB",100);
		Product p2 = new Product("PAN",2345);
		Product p3 = new Product("Pizza",123);

		c1.addItem(p1,10);
		c2.addItem(p2,20);
		assertTrue(c1.products.contains(p1));
		assertTrue(c2.products.contains(p2));
		
	
	}
}
