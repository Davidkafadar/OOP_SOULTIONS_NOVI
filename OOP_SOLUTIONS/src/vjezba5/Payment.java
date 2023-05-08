package vjezba5;

public class Payment {
	
	
	private String payment;
	
	public Payment(String payment) {
		this.payment = payment;
		
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Payment [payment=" + payment + "]";
	}
	
	

}
