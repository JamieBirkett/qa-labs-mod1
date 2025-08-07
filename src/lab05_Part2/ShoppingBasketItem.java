package lab05_Part2;

public class ShoppingBasketItem {
	private String productName;
	private int quantity;
	private double price;
	
	public ShoppingBasketItem(String name, double price, int quantity) {
		this.price = price;
		this.productName = name;
		this.quantity = quantity;
	}
	
	public String getDetails() {
		return String.format("Item: %s | Price: £%.2f | Quantity: %d", productName, price, quantity);
	}
	
	public int getItemQuantity() {
		return quantity;
	}
	
	public double getItemPrice() {
		return price;
	}
	
	
}
