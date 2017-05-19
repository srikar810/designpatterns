package singletonDesPtn;

public class SingletonTheadClass {
public static void main(String[] args) {
	Runnable getTiles = new getTiles();
	Runnable getTilesAgain = new getTiles();
	new Thread(getTiles).start();
	new Thread(getTilesAgain).start();
	
}
}
