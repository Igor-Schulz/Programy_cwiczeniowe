package implementation;

import java.util.HashMap;
import java.util.Map;

import exception.DictionaryException;

public class DictionaryImpl implements Dictionary {

	@Override
	public Map<String, Integer> searchDictionary(String text) throws DictionaryException {
		validate(text);
		text = text.toLowerCase();
		String[] words = text.split(" ");
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		
		for(String word : words)
		{
			if(dictionary.containsKey(word))
			{
				dictionary.put(word, dictionary.get(word)+1);
			}
			else
			{
				dictionary.put(word,1);
			}
		}
		return dictionary;
	}

	private void validate(String text) throws DictionaryException {
		if(text==null) 
		{
			throw new DictionaryException("Text cannot be null");
		}
		for(char sign : text.toCharArray())
		{
			if(!((sign >= 97 && sign <= 122) || ((sign >= 65 && sign <= 90))) && sign!=32)
			{	
				throw new DictionaryException("Text can only contain letters");
			}	
		}
		
	}

}
