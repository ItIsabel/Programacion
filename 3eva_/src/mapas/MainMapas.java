package mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMapas {

	public static void main(String[] args) {
		//hashmap
		Map<String,Integer> map= new HashMap<>();
		map.put("Isabel", 35);
		map.put("Rebeca", 18);
		map.put("Javi", 32);
		map.put("Manar", 18);
		System.out.println("Hashmap - sin orden \n" +map.toString());
		Collection <String> nombre=map.keySet();
		nombre.clear();
		System.out.println("despues de vaciar la Coleccion \n" + map.toString()+"\n");
		
		
		//linkedhashmap
		Map<String,Integer> map1= new LinkedHashMap<>();
		map1.put("Isabel", 35);
		map1.put("Rebeca", 18);
		map1.put("Javi", 32);
		map1.put("Manar", 18);
		System.out.println("LinkedHashMap, orden segun introduccion \n" +map1.toString()+"\n");
		
		//treemap
		Map<String,Integer> map2= new TreeMap<>();
		map2.put("Isabel", 35);
		map2.put("Rebeca", 18);
		map2.put("Javi", 32);
		map2.put("Manar", 18);
		System.out.println("TreeMap  - orden alfabetico de la keyword \n" +map2.toString()+"\n");

	}

}
