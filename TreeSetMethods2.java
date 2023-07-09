package set;
import java.util.*;

public class TreeSetMethods2 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		System.out.println("Normal Order : "+ns);
		//Get a reverse view of the navigable set
		NavigableSet<Integer> reverseNs = ns.descendingSet();
		//print the reverse view
		System.out.println("Reverse Order : "+reverseNs);
		//return lower if available, otherwise null
		System.out.println("Lower (3) : "+ns.lower(3)); 
		//return equal if available, otherwise lower if available, otherwise null
		System.out.println("Floor (3) : "+ns.floor(3));
		//return higher if available, otherwise null
		System.out.println("Higher (3) : "+ns.higher(3));
		//return equal if available, otherwise higher if available, otherwise null
		System.out.println("Ceiling (3) : "+ns.ceiling(3));

	}

}
