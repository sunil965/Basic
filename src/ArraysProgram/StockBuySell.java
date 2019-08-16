package ArraysProgram;

import java.util.ArrayList;

class Interval { 
	int buy, sell; 
} 

class StockBuySell { 
	void stockBuySell(int price[], int n) 
	{ 
		if (n == 1) 
			return; 

		ArrayList<Interval> sol = new ArrayList<Interval>(); 

		int i = 0; 
		while (i < n - 1) { 
			Interval e = new Interval(); 
			while ((i < n - 1) && ( price[i] >= price[i + 1])) 
				i++; 

			if (i == n - 1) 
				break; 

			e.buy = i++; 
			
			while ((i < n) && (price[i] >= price[i - 1])) 
				i++; 

			e.sell = i - 1; 
			sol.add(e); 

		} 

		// print solution 
		if (sol.size() == 0) 
			System.out.println("There is no day when buying the stock will make profit"); 
		else
			for (int j = 0; j < sol.size(); j++) 
				System.out.println("Buy on day: " + sol.get(j).buy + "	 "+ "Sell on day : " + sol.get(j).sell); 

	} 

	public static void main(String args[]) 
	{ 
		StockBuySell stock = new StockBuySell(); 
		int price[] = { 100, 180, 260, 310, 40, 535, 695 }; 
		int n = price.length; 
		stock.stockBuySell(price, n); 
	} 
}