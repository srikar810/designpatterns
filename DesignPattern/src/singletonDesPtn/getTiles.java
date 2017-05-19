package singletonDesPtn;
import java.util.*;

public class getTiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singletoncls newSingletoncls = Singletoncls.getInstance();
		
		System.out.println("Instance Id"+ System.identityHashCode(newSingletoncls));
		
		System.out.println(newSingletoncls.getLetterList());
		
		LinkedList<String> playerOneTiles = newSingletoncls.getTiles(7);
		
		System.out.println(playerOneTiles);
		System.out.println("got tiles");
		/*Singletoncls Singletoncls2 = Singletoncls.getInstance();
		System.out.println("Instance Id"+ System.identityHashCode(Singletoncls2));
		System.out.println(Singletoncls2.getLetterList());
		LinkedList<String> playerTwoTiles = Singletoncls2.getTiles(7);
		System.out.println(playerTwoTiles);*/

	}

}
