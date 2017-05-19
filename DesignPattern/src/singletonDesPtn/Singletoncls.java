package singletonDesPtn;

import java.util.*;

public class Singletoncls {
 private static Singletoncls firstInstance = null;
 String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};  
 private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
 static boolean firstThread = true;
 private Singletoncls(){};
 
 /*
  *  we can add synchronize method to the getInstance so that only one
  *   thread will be accessing the method
  *   But that would slow our system   
  */
 
 public static Singletoncls getInstance(){
	 if(firstInstance == null){
		 if(firstThread){
			 firstThread = false;
			 Thread.currentThread();
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 synchronized (Singletoncls.class) {
			 if(firstInstance == null){
				 firstInstance = new Singletoncls();
				 Collections.shuffle(firstInstance.letterList);
			 }
		}
	 }
	 return firstInstance;
 }
 public LinkedList<String> getLetterList(){
	 return firstInstance.letterList;
 }
 public LinkedList<String> getTiles(int count){
	 
	 LinkedList<String> tilesListToSend = new LinkedList<String>();
	 for(int i=0;i<= count; i++){
		 tilesListToSend.add(firstInstance.letterList.remove(0));
	 }
	 return tilesListToSend;
 }
}
