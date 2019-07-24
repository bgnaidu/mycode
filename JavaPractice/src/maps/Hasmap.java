package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class Hasmap {
	public static void main(String[] args) {
		
	
	Map<String, Integer> map=new HashMap<>();
	
	map.put("naidu", 26);
	map.put("Gopi", 27);
	map.put("Ravi", 25);

Set<String> set=map.keySet();
System.out.println(set);
Collection<Integer> values = map.values();
System.out.println(values);
for (String key : set) {
	
	System.out.println("key:"+key +"value:"+map.get(key));
	
}
// normal hash map overrides duplicate key values
// Identity hash map allows duplicate keys
Map<Integer, String> map1=new IdentityHashMap<>();
Integer ob1=new Integer(10);
Integer ob2=new Integer(10);
map1.put(ob1, "naidu");
map1.put(ob2, "gopi");
System.out.println(map1);

}
}