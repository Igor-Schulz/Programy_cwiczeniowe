package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import exception.DictionaryException;
import implementation.Dictionary;
import implementation.DictionaryImpl;

public class DictionaryTest {

	private Dictionary dictionary = new DictionaryImpl();
	
	@Test
	public void success() throws DictionaryException {
		// given
		String text = "I am Igor and I am a human";
		// when
		
		Map<String,Integer> expectedDictionary = new HashMap<String,Integer>();
		expectedDictionary.put("i", 2);
		expectedDictionary.put("am", 2);
		expectedDictionary.put("igor", 1);
		expectedDictionary.put("and", 1);
		expectedDictionary.put("a", 1);
		expectedDictionary.put("human", 1);
		
		Map<String,Integer> testedDictionary = dictionary.searchDictionary(text);
		// then
		Assert.assertEquals(expectedDictionary, testedDictionary);
	}
	@Test(expected = DictionaryException.class)
	public void wrongCharacter() throws DictionaryException {
		// given
		String text = "I am Igor and I am 22 years old";
		// when
		dictionary.searchDictionary(text);
		//then
		Assert.fail();
	}
	@Test(expected = DictionaryException.class)
	public void nullPointer() throws DictionaryException {
		// given
		String text = null;
		dictionary.searchDictionary(text);
		// then
		Assert.fail();
	}
}