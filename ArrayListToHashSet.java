package set;
import java.util.*;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		
		//Adding duplicates
		al.add("Monday");
		al.add("Friday");
		System.out.println(al); //collection with duplicates
		
		HashSet<String> hset = new HashSet<String>(al);
		System.out.println(hset); //collection without duplicates

	}

}
