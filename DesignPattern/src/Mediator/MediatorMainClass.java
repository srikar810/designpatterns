package Mediator;

public class MediatorMainClass {

public static void main(String[] args) {
	StockMediator nyse = new StockMediator();
	GormanSlacks broker = new GormanSlacks(nyse);
	nyse.addColleague(broker);
	JtPoorman broker1 = new JtPoorman(nyse);
	nyse.addColleague(broker1);
	
	broker.saleOffer("MSFT", 100);
	broker.saleOffer("GOOG", 150);
	
	broker1.buyOffer("MSFT", 100);
	broker1.saleOffer("NRG",10);
	
	broker.buyOffer("NRG",10);
	
	nyse.getStockOfferings();
	nyse.getCOlleagues();

}


}
