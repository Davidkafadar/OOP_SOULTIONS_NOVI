package vjezba5;
import java.util.Scanner;


public class TestInner {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer("RST234");
		System.out.println(customer);
		Payment payment1 = new Payment("Card 100");
		System.out.println(payment1);
		Package package1 = new Package("SHOP1", "destinacija-1", customer, payment1);
		package1.packageInfo();
		package1.putContent();
		System.out.println("--------------------------------------------------------------------");
		package1.packageInfo();
		
		
		
	}



}
