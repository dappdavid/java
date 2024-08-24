package prep.playground;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableTest {

	/*
	 * Declare the class as final so it can’t be extended. 
	 * Make all of the fields private so that direct access is not allowed. 
	 * Don’t provide setter methods for variables. 
	 * Make all mutable fields final so that a field’s value can be
	 * assigned only once. 
	 * Initialize all fields using a constructor method
	 * performing deep copy. 
	 * Perform cloning of objects in the getter methods to
	 * return a copy rather than returning the actual object reference.
	 */
	
	private final int id;
	private final String name;
	private final HashMap<String,String> testMap;
	public ImmutableTest(int id, String name, HashMap<String, String> map) {
		this.id = id;
		this.name = name;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, map.get(key));
		}
		this.testMap=tempMap;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	

	
	
	
}
