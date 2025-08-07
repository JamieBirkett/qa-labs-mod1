package lab05_Part2;

import java.util.ArrayList;

public class ShoppingBasket {
	private ArrayList<ShoppingBasketItem> basketItems;
	
	
	public ShoppingBasket() {
		this.basketItems = new ArrayList<>();
	}
	
	void add(ShoppingBasketItem item) {
		this.basketItems.add(item);
	}
	
	public ArrayList<ShoppingBasketItem> getBasketItems(){
		return basketItems;
	}
	
	
}

