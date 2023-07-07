package set;
import java.util.*;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(40);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(30));
		System.out.println(ts.tailSet(30));
		System.out.println(ts.subSet(20, 50));

	}

}
