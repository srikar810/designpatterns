package FactoryDesignPattern;

public class EnemyShipFactory {
	
public EnemyShip makeEnemyShip(String shipType){
	
	if(shipType.equalsIgnoreCase("u")){
		return new UFOEnemyShip();
	}
	else if(shipType.equalsIgnoreCase("r")){
		return new RocketEnemyShip();
	}
	else{
		System.out.println("none bro !! we are all out");
		return null;
	}
}
}
