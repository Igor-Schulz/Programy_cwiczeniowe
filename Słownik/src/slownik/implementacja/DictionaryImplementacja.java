package slownik.implementacja;

import java.util.HashMap;
import java.util.Map;

import slownik.exception.DictionaryException;

public class DictionaryImplementacja implements DictornaryInterface{
	public HashMap<Character,Integer> PrzetworzString(String s, HashMap<Character,Integer> mapa )throws DictionaryException {
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			  mapa.put(ch, 0); 
		}
		SprawdzString(s);
		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);        
		    for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
		        char key = entry.getKey();
		        Object value = entry.getValue();
		        	if(key == c) {
		        		mapa.put(key, (int)value + 1);
		        	}
		        
		    }
		}
		return mapa;
	}
	public void SprawdzString(String s)throws DictionaryException {
		if(s == "" || s == null ) {
			throw new DictionaryException("String nie mo¿e byæ pusty");
		}
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c < 97 || c > 122) {
				throw new DictionaryException("String mo¿e zawieraæ tylko ma³e litery bez polskich zaków");
			}
		}
	}
}

/*
public class DictionaryImplementacja {
	
	public static void przetworzString(String s, HashMap<Character,Integer> mapa) {

		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);        
		    for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
		        char key = entry.getKey();
		        Object value = entry.getValue();
		        	if(key == c) {
		        		mapa.put(key, (int)value + 1);
		        	}
		        
		    }
		}
		for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
			char key = entry.getKey();
	        Object value = entry.getValue();
	        System.out.println("Litera: " + key +" wyst¹pi³a: "+value+" razy");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> slownik = new HashMap<Character,Integer>() {};
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			  slownik.put(ch, 0); 
		}
		przetworzString("ania",slownik);
	}

}*/

