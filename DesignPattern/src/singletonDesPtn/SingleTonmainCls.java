package singletonDesPtn;

import java.util.LinkedList;


public class SingleTonmainCls {
	/*
	 * Used to eliminate the option of instantiating more than one object
	 * Concept:scrabble game
	 * Every one will be using form the same potential list
	 * each will have his own set of letters
	 */
public static void main(String[] args) {
	Singletoncls newSingletoncls = Singletoncls.getInstance();
	
	System.out.println("Instance Id"+ System.identityHashCode(newSingletoncls));
	
	System.out.println(newSingletoncls.getLetterList());
	
	LinkedList<String> playerOneTiles = newSingletoncls.getTiles(7);
	
	System.out.println(playerOneTiles);
	
/*	Singletoncls Singletoncls2 = Singletoncls.getInstance();
	System.out.println("Instance Id"+ System.identityHashCode(Singletoncls2));
	System.out.println(Singletoncls2.getLetterList());
	LinkedList<String> playerTwoTiles = Singletoncls2.getTiles(7);
	System.out.println(playerTwoTiles);
	*/
}
}
