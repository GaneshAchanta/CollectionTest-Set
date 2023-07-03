package set;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet declaration
		HashSet<String> hset = new HashSet<String>();
		//Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		System.out.println(hset);
		
		//Adding duplicates
		hset.add("Apple");
		hset.add("Mango");
		System.out.println(hset);
		
		//Adding null values
		hset.add(null);
		hset.add(null); //accepts only one null value
		System.out.println(hset);

	}

}
