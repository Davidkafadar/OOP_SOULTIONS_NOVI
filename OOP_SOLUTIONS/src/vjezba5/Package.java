package vjezba5;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Package {
	
	
	private int id;
	private int cntId= 100;
	private String webShop;
	private String destination;
	private Customer customer;
	private float packagePrice;
	private int totalItems;
	private List<Item> items;
	private static final float MINF =10;
	private static final float MAXF = 150;
	private static final int KOMS = 10;
	private String[] typeItems = {"Tshirts", "Sneakers" };
	private Set<Payment> payments;
	private Scanner sc;
	
	
	
	
	
	public Package(String shop, String destination, Customer customer, Payment payment) {
		this.id = cntId++;
		this.items = new ArrayList<>();
		this.payments = new HashSet<>();
		this.webShop = shop;
		this.destination = destination;
		this.customer = customer;
		this.payments.add(payment);
	}
	public void setScanner (Scanner scanner) {
		this.sc = scanner;
	}
	
	
	public boolean checkPaymentForPackage() {
		System.out.println("Enter payment method...");
		boolean status = false;
		String paymentMethod = sc.nextLine();
		for (Payment payment : payments) {
			if (payment.getPayment().equals(paymentMethod));
			status = true;
			break;
			
		}
		
		
		return status;
		
	}
	
	
	private float randItemPrice() {
		return ThreadLocalRandom.current().nextFloat(MINF, MAXF);
	}
	
	private int randNumItems() {
		return ThreadLocalRandom.current().nextInt(KOMS);
		
	}
	
	public void putContent() {
		int numItems = randNumItems();
		int[] indx = new int[numItems];
		for(int k = 0; k < numItems; k++) {
			indx[k] = ThreadLocalRandom.current().nextInt(typeItems.length);
			
		}
		for (int k=0; k < numItems; k++) {
			if (indx[k] == 0) {
				T_Shirt t_shirt = new T_Shirt(randItemPrice(), randNumItems());
				items.add(t_shirt);
			}else  {
				Sneakers sneakers = new Sneakers(randItemPrice(), randNumItems());
				items.add(sneakers);
			}
			
		}
		System.out.println("Finished putting content into package!!!");
		calculateTotalPackageItems();
		calculateTotalPackagePrice();
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Package [id=" + id + ", cntId=" + cntId + ", webShop=" + webShop + ", destination=" + destination
				+ ", customer=" + customer + ", packagePrice=" + packagePrice + ", totalItems=" + totalItems
				+ ", items=" + items + "]";
	}
	
	public void packageInfo() {
		System.out.println(this);
	}
	
	
	
	public void calculateTotalPackagePrice() {
		for (Item item: items) {
			packagePrice += item.calculatePrice();
			
		}
		System.out.println("price is calculated...");
	}
	
	public void calculateTotalPackageItems() {
		for(Item item : items) {
			totalItems += item.getNumItems();
			
		}
		System.out.println("items are numbered...");
		
		
		
	}
	
	
	class T_Shirt extends Item{

		protected T_Shirt(float itemPrice, int numItems) {
			super(itemPrice, numItems);
			
		}

		@Override
		protected float calculatePrice() {
			return this.itemPrice *this.numItems;
			
			
		}
		
	}
	 class Sneakers extends Item{

		protected Sneakers(float itemPrice, int numItems) {
			super(itemPrice, numItems);
			
		}

		@Override
		protected float calculatePrice() {
			
			return (float) (0.9*this.itemPrice*this.numItems);
		}
		 
	 }
	
	

}
