package slownik.implementacja;

import java.util.HashMap;

import slownik.exception.DictionaryException;

public interface DictornaryInterface{
	public HashMap<Character,Integer> PrzetworzString(String s, HashMap<Character,Integer> mapa ) throws DictionaryException;
}
