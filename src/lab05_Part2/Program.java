package lab05_Part2;

import java.util.ArrayDeque;

public class Program {

	static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<ShoppingBasket>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.add(new ShoppingBasketItem("Apple", 0.59, 3));
		basket1.add(new ShoppingBasketItem("Banana", 0.45, 6));
		basket1.add(new ShoppingBasketItem("Pear", 0.55, 4));
		baskets.add(basket1);
		
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.add(new ShoppingBasketItem("TV", 850, 1));
		basket2.add(new ShoppingBasketItem("PS5", 400, 1));
		baskets.add(basket2);
		
		ShoppingBasket basket3 = new ShoppingBasket();
		basket3.add(new ShoppingBasketItem("T-Shirt", 15.99, 1));
		basket3.add(new ShoppingBasketItem("Socks", 4.99, 2));
		baskets.add(basket3);
		
		processBaskets();
	}
	
	static void processBaskets(){
		System.out.printf("Queue Starting \nBaskets in queue: %d\n---------------------- \n", baskets.size());
		
		int queuePosition = 0;
		while (!baskets.isEmpty()) {
			queuePosition++;
			double basketTotal = 0;
			
			System.out.printf("Processing Basket: %d \n", queuePosition);
			
			ShoppingBasket basket = baskets.pop();
			
			for (ShoppingBasketItem item : basket.getBasketItems()) {
				System.out.println(item.getDetails());
				
				basketTotal += (item.getItemPrice() * item.getItemQuantity());
				
			}
			System.out.printf("Basket Total: £%.2f \n\n", basketTotal);
			
			
		}
		
		System.out.printf("---------------------- \nQueue finished \n");
	}

}
