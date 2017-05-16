package Mediator;

public class StockOffer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;
	
	public StockOffer(int numOfShares,String StockSmbl,int collCode){
		stockShares = numOfShares;
		stockSymbol = StockSmbl;
		colleagueCode = collCode;
	}
	public int getStockShares() {
		return stockShares;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public int getColleagueCode() {
		return colleagueCode;
	}
}
