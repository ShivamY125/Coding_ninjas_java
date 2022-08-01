package rZZ_Hashmap;
import java.util.HashMap;
import java.util.Set;
public class _01MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       HashMap<key,value>
		HashMap<String,Integer> map = new HashMap<>();
//  insert:-
		map.put("abc", 1);
		map.put("def",2 );
		map.put("abc1", 3);
		map.put("def1",4);
		System.out.println("size:- "+ map.size());
// check Presense of of key:-	
//		work on any key is O(1):-
		if(map.containsKey("abc")) {
			System.out.println(" has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println(" has abc1 ");
		}
//		Work on any Value is O(n):- 
		if(map.containsValue(2)) {
			System.out.println("has 2 as value");
	 	}
	
//	 get values:-
//		if key is present in map:
		int v = map.get("abc");
//	System.out.println(v);
// if not present then:-
//	int V = map.get("abc1");
//	it will give null pointer exception:-
//	System.out.println(V);
// instead we can get value for v:-
	int V =0;
	if(map.containsKey("abc1")) {
		V = map.get("abc1");
		
	}
	System.out.println(V);
	
//	remove
	int s = map.remove("abc");
	System.out.println(s);
	
	
// iteration over maps:-
	Set<String> keys = map.keySet();
	for(String str: keys) {
		System.out.println(str); 
	}
	
	
	
	
	}
	
	
	
	
	


}
