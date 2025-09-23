package learningJava.advancedJava;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 1, 5, 3, 2, 6};
		int profit = 0; int minimum = a[0];
		for(int i = 1; i < a.length; i++) {
			minimum = Math.min(minimum, a[i]);
			int sellingPrice = a[i] - minimum;
			profit = Math.max(profit, sellingPrice);
		}
		System.out.println(profit);
	}

}
