package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {
	public static void main(String[] args) {
		
	
	Map<String, Integer> map=new LinkedHashMap<>();
	
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

}
}