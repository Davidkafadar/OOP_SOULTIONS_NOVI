package vjezba5;

public class Customer {
	
	private String customerName;
	private int id;
	private static int cntId = 20;
	
	
	public Customer(String name) {
		this.customerName = name;
		this.id = cntId++;
		
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", id=" + id + "]";
	}
	public void customerInfo() {
		System.out.println(this);
	}
	

}
