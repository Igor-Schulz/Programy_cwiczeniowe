package implementation;

import java.util.Map;

import exception.DictionaryException;

public interface Dictionary  {
	public Map<String,Integer> searchDictionary(String text) throws DictionaryException;
}
