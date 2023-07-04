package set;
import java.util.*;

class HashStudent{
	//declare instance variables
	String name, sName;
	int id;
	public HashStudent(String name, String sName, int id) {
		super();
		this.name = name;
		this.sName = sName;
		this.id = id;
	}
	@Override
	public String toString() {
		return "HashStudent [name=" + name + ", sName=" + sName + ", id=" + id + "]";
	}
}

public class HashSetWithUserObjects {

	public static void main(String[] args) {
		HashSet<HashStudent> hset = new HashSet<HashStudent>();
		//create objects of student class and pass the parameters
		HashStudent s1 = new HashStudent("John","RSVM",0012);
		HashStudent s2 = new HashStudent("SHUBH","DPS",1234);
		HashStudent s3 = new HashStudent("RICKS","DAV",9876);
		//Adding elements to HashSet and pass reference variables
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		
		for(HashStudent s:hset) {
			System.out.println(s);
		}

	}

}
