package Mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator{

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSellOffers;
	
	private int colleagueCodes = 0;
	
	
	public void saleOffer(String stock, int shares, int CollCode) {
		boolean stockSold = false;
		for(StockOffer offer : stockBuyOffers){
			if((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)){
				System.out.println(shares+"shares of "+ stock + "sold to colleague code"+ offer.getColleagueCode());
				stockBuyOffers.remove(offer);
				stockSold= true;
			}
			if(stockSold){break;}
		}
		if(!stockSold){
			System.out.println(shares+"share of"+stock+"added to inventory");
			StockOffer newOffering = new StockOffer(shares, stock, CollCode);
			stockSellOffers.add(newOffering);
		}
	}

	public StockMediator() {
		colleagues = new ArrayList<Colleague>();
		stockBuyOffers = new ArrayList<StockOffer>();
		stockSellOffers = new ArrayList<StockOffer>();
	}

	public void buyOffer(String stock, int shares, int CollCode) {

		boolean stockBought = false;
		for(StockOffer offer : stockSellOffers){
			if((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)){
				System.out.println(shares+"shares of "+ stock + "bought by colleague code"+ offer.getColleagueCode());
				stockSellOffers.remove(offer);
				stockBought= true;
			}
			if(stockBought){break;}
		}
		if(!stockBought){
			System.out.println(shares+"share of"+stock+"added to inventory");
			StockOffer newOffering = new StockOffer(shares, stock, CollCode);
			stockBuyOffers.add(newOffering);
		}
	
		
	}

	public void addColleague(Colleague newColleague) {
		// TODO Auto-generated method stub
		colleagues.add(newColleague);
		colleagueCodes++;
		System.out.println(colleagueCodes);
		newColleague.setColleagueCode(colleagueCodes);
	}
	
	public void getStockOfferings(){
		System.out.println("\n stocks for sale");
		for(StockOffer offer : stockSellOffers){
			System.out.println(offer.getStockShares()+","+offer.getStockSymbol());
		}
		System.out.println("\n stocks buy offerings");
		for(StockOffer offer : stockBuyOffers){
			System.out.println(offer.getStockShares()+","+offer.getStockSymbol());
		}
	}
	public void getCOlleagues(){
		System.out.println("get coleagues"+ colleagues.size());
		for(Colleague colleague : colleagues){
			System.out.println(colleague.toString());
		}
	}

}
