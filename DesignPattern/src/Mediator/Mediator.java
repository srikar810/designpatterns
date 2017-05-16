package Mediator;

public interface Mediator {

	public void saleOffer(String stock,int shares,int CollCode);
	public void buyOffer(String stock,int shares,int CollCode);
	public void addColleague(Colleague colleague);
}
