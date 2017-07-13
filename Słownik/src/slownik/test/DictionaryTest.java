package slownik.test;



import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import slownik.exception.DictionaryException;
import slownik.implementacja.DictionaryImplementacja;

public class DictionaryTest {

	DictionaryImplementacja slownik = new DictionaryImplementacja();
	@Test(expected = DictionaryException.class)
	public void DuzeLitery() throws DictionaryException {
		String s = "HSksakd";
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		slownik.PrzetworzString(s, mapa);
		
	}
	@Test(expected = DictionaryException.class)
	public void Cyfry() throws DictionaryException {
		String s = "12345";
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		slownik.PrzetworzString(s, mapa);
		
	}
	@Test(expected = DictionaryException.class)
	public void PustyString() throws DictionaryException {
		String s = "";
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		slownik.PrzetworzString(s, mapa);
		
	}
	@Test(expected = DictionaryException.class)
	public void StringZNullem() throws DictionaryException {
		String s = null;
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		slownik.PrzetworzString(s, mapa);
		
	}
	@Test
	public void PoprawneDzia³anie() throws DictionaryException {
		String s = "igor";
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		HashMap<Character,Integer> mapa_aktualna = slownik.PrzetworzString(s, mapa);
		HashMap<Character,Integer> mapa_oczekiwana = new HashMap<Character,Integer>();
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			  mapa_oczekiwana.put(ch, 0); 
		}
		mapa_oczekiwana.put('i', 1);
		mapa_oczekiwana.put('g', 1);
		mapa_oczekiwana.put('o', 1);
		mapa_oczekiwana.put('r', 1);
		assertEquals(mapa_oczekiwana.size(),mapa_aktualna.size());
		for(Map.Entry<Character,Integer> value:mapa_oczekiwana.entrySet()){
	         int actualValue = mapa_aktualna.get(value.getKey());
	         assertNotNull(actualValue);
	         assertEquals(value.getValue(), actualValue,0);
		
		 	
		 }


		
	}
	
}
