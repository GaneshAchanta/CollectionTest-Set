package set;
import java.util.*;

public class HashSetIteration {

	public static void main(String[] args) {
		Set<String> setOfStocks = new HashSet<String>();
		setOfStocks.add("INFY");
		setOfStocks.add("BABA");
		setOfStocks.add("GOOG");
		setOfStocks.add("MSFT");
		setOfStocks.add("AMZN");
		System.out.println("Set : "+setOfStocks);
		
		//ex-1: iterating over HashSet using iterator
		Iterator<String> itr = setOfStocks.iterator();
		//traversing over HashSet
		System.out.println("Traversing over Set using iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//ex-2: looping over HashSet using for loop
		System.out.println("Looping over HashSet using Advanced for loop");
		for(String stock:setOfStocks) {
			System.out.println(stock);
		}

	}

}
