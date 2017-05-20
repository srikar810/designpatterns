package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryPatterCls {
/*
 * Factory pattern allows you to create objects without knowing the exact class of the 
 * object that will be created
 * Concept: Creating objects which share a common super class
 * a video game
 */
	public static void main(String[] args) {

		EnemyShip thEnemyShip = null;
		
		Scanner userInout = new Scanner(System.in);
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		System.out.println("which on U/R");
		
		if(userInout.hasNextLine()){
			String typeofShip = userInout.nextLine();
			thEnemyShip = shipFactory.makeEnemyShip(typeofShip);
		}
		if( thEnemyShip != null){
			doStuffEnemy(thEnemyShip);
		}else{
			System.out.println("hu ha ha ha");
		}
	}

private static void doStuffEnemy(EnemyShip anEneyShip) {
	// TODO Auto-generated method stub
	anEneyShip.displayEnemySHip();
	anEneyShip.enemyShipShoots();;
	anEneyShip.followHeroShip();
	
}

}
